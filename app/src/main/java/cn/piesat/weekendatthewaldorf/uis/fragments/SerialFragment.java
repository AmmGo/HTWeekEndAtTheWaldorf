package cn.piesat.weekendatthewaldorf.uis.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;

import net.arvin.baselib.utils.ToastUtil;

import java.util.ArrayList;
import java.util.List;

import cn.piesat.weekendatthewaldorf.R;
import cn.piesat.weekendatthewaldorf.entities.movie.MovieNewMoviesEntity;
import cn.piesat.weekendatthewaldorf.entities.movie.MovieWeeklyEntity;
import cn.piesat.weekendatthewaldorf.nets.Api;
import cn.piesat.weekendatthewaldorf.nets.retrofit.RetrofitClient;
import cn.piesat.weekendatthewaldorf.uis.adapters.MovieTabsWeeklyAdapter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class SerialFragment extends Fragment {


    private static SerialFragment btlistFragment;
    private View view;
    private RecyclerView recyclerView;
    private Api api;
    private List<MovieWeeklyEntity.SubjectsBean> movieWeeklyList;
    private MovieTabsWeeklyAdapter movieTabsAdapter;
    private String type;

    public SerialFragment() {
        // Required empty public constructor
    }


    public static SerialFragment newInstance(String type) {
        btlistFragment = new SerialFragment();
        Bundle bundle = new Bundle();
        bundle.putString("Type", type);
        btlistFragment.setArguments(bundle);
        return btlistFragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_serial, container, false);
        initService();
        initView();
        ConfigRecyclerView();
        initData();
        return view;
    }

    private void initService() {
        api = new RetrofitClient().getMovieService();
    }
    private void initData() {
        Observable<MovieWeeklyEntity> observable = api.getMovieWeekly(Api.API_KEY);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MovieWeeklyEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        ToastUtil.showToast(getContext(), "dieng");
                    }

                    @Override
                    public void onNext(MovieWeeklyEntity movie) {
                        movieWeeklyList = new ArrayList<>();
                        movieWeeklyList.addAll(movie.subjects);
                        movieTabsAdapter.setNewData(movieWeeklyList);
                        ToastUtil.showToast(getContext(), "dieng");
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.showToast(getContext(), "dieng");
                    }

                    @Override
                    public void onComplete() {
                        ToastUtil.showToast(getContext(), "dieng");
                    }
                });
    }
    private void initView() {
        recyclerView = view.findViewById(R.id.recycler_tabs_movie);
        Bundle bundle = getArguments();
        this.type = bundle.getString("Type");
    }

    private void ConfigRecyclerView() {
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        movieWeeklyList = new ArrayList<>();
        movieTabsAdapter = new MovieTabsWeeklyAdapter(movieWeeklyList);
        recyclerView.setAdapter(movieTabsAdapter);
        movieTabsAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

            }
        });
        movieTabsAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        movieTabsAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
            }
        });
    }
}
