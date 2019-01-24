package cn.piesat.weekendatthewaldorf.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.piesat.weekendatthewaldorf.uis.view.LoadDataView;

/**
 * @author yjl WeekendAtTheWaldorf
 * @name BaseFragment
 * @class name：cn.piesat.weekendatthewaldorf.base
 * @class describe
 * @time 2019/1/24 19:43
 * @change
 * @chang time
 * @class describe
 */
public abstract class BaseFragment extends Fragment {
    private Unbinder mUnbinder;
    private LoadDataView mLoadView;

    protected abstract int layoutId();
    protected abstract void initView();

    protected abstract void getLoadView(LoadDataView mLoadView);
    protected abstract void initData();

    protected abstract void initPresenter();



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        try{
            if(null==mLoadView){
                View view = inflater.inflate(layoutId(), container, false);
                mUnbinder = ButterKnife.bind(this, view);
                mLoadView = new LoadDataView(getActivity(), view);
            }
        }catch (Exception e){
            if(null!=mLoadView){
                ((ViewGroup)mLoadView.getParent()).removeView(mLoadView);
                View view = inflater.inflate(layoutId(), container, false);
                mUnbinder = ButterKnife.bind(this, view);
                mLoadView = new LoadDataView(getActivity(), view);
            }
        }
        return mLoadView;

    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        getLoadView(mLoadView);
        initPresenter();
        initData();
    }

    @Override
    public void onDestroyView() {
        if(null!=mLoadView){
            if(null!=((ViewGroup)mLoadView.getParent())){
                ((ViewGroup)mLoadView.getParent()).removeView(mLoadView);
            }
            mLoadView=null;
        }
        if(null!=mUnbinder){
            mUnbinder.unbind();
        }
        super.onDestroyView();
    }
}
