package cn.piesat.weekendatthewaldorf.uis.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;

import net.arvin.baselib.base.BaseFragment;
import net.arvin.baselib.widgets.TitleBar;

import java.util.Arrays;
import java.util.List;

import cn.piesat.weekendatthewaldorf.R;

/**
 * @author yjl WeekendAtTheWaldorf
 * @name MainFragment
 * @class name：cn.piesat.weekendatthewaldorf.uis.fragments
 * @class describe
 * @time 2019/1/17 19:58
 * @change
 * @chang time
 * @class describe
 */
public class MainFragment extends BaseFragment implements View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener {
    private IDrawerToggle drawerToggle;

    private TitleBar titleBar;
    private BottomNavigationView bottomNavigationView;

    private List<Integer> tabIds = Arrays.asList(R.id.tab_movie, R.id.tab_music, R.id.tab_book, R.id.tab_project);
    private SparseArray<BaseFragment> fragments = new SparseArray<>();
    private SparseArray<Class<? extends BaseFragment>> fragmentClasses = new SparseArray<>();
    private SparseIntArray fragmentTitles = new SparseIntArray();

    {
        fragmentClasses.put(R.id.tab_movie, HomeFragment.class);
        fragmentClasses.put(R.id.tab_music, MusicFragment.class);
        fragmentClasses.put(R.id.tab_book, BooksFragment.class);
        fragmentClasses.put(R.id.tab_project, ProjectFragment.class);

        fragmentTitles.put(R.id.tab_movie, R.string.tab_movie);
        fragmentTitles.put(R.id.tab_music, R.string.tab_music);
        fragmentTitles.put(R.id.tab_book, R.string.tab_book);
        fragmentTitles.put(R.id.tab_project, R.string.tab_project);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IDrawerToggle) {
            drawerToggle = (IDrawerToggle) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        drawerToggle = null;
    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        titleBar = root.findViewById(R.id.title_bar);
        titleBar.getLeftImageView().setOnClickListener(this);
        titleBar.getRightImageView().setOnClickListener(this);

        bottomNavigationView = root.findViewById(R.id.tab_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(tabIds.get(0));
    }

    @Override
    public void onClick(View v) {
        if (v == titleBar.getLeftImageView()) {
            drawerToggle.toggle();
        } else if (v == titleBar.getRightImageView()) {
//            startActivity(new Intent(getActivity(), SearchActivity.class));
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        hideAll(beginTransaction);

        int itemId = item.getItemId();
        if (tabIds.contains(itemId)) {
            titleBar.getCenterTextView().setText(fragmentTitles.get(itemId));

            BaseFragment fragment = fragments.get(itemId);
            if (fragment == null) {
                try {
                    fragment = fragmentClasses.get(itemId).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (fragment != null) {
                    beginTransaction.add(R.id.layout_content, fragment);
                    fragments.put(itemId, fragment);
                }
            } else {
                beginTransaction.show(fragment);
            }
            beginTransaction.commitAllowingStateLoss();
            return true;
        }
        return false;
    }

    private void hideAll(FragmentTransaction beginTransaction) {
        for (Integer tabId : tabIds) {
            BaseFragment fragment = fragments.get(tabId);
            if (fragment != null) {
                beginTransaction.hide(fragment);
            }
        }
    }

    public interface IDrawerToggle {
        void toggle();
    }
}
