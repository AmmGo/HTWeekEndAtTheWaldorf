package cn.piesat.weekendatthewaldorf.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import butterknife.ButterKnife;
import cn.piesat.weekendatthewaldorf.uis.view.LoadDataView;

/**
 * @author yjl WeekendAtTheWaldorf
 * @name BaseActivity
 * @class name：cn.piesat.weekendatthewaldorf.base
 * @class describe
 * @time 2019/1/24 19:43
 * @change
 * @chang time
 * @class describe
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        Application.putActivityInfoToMap(this);
        ButterKnife.bind(this);
        initView();
        initViewGroup();
        initPresenter();
        initData();
    }

    protected abstract int layoutId();

    /**
     * 嵌入loaddataview
     */
    private void initViewGroup() {
        ViewGroup view = loadDataViewLayout();
        if (null != view) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
                this.mLoadView = new LoadDataView(this, view);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
             /*   params.addRule(RelativeLayout.BELOW, R.id.include_topbar);
                params.setMargins(0, 0, 0, 0);*/
                viewGroup.addView(this.mLoadView, params);
                getLoadView(this.mLoadView);
            }
        }
    }

    protected abstract ViewGroup loadDataViewLayout();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void getLoadView(LoadDataView loadView);

    protected abstract void initPresenter();

    private LoadDataView mLoadView;
    private Context context;
    public void toActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
