package cn.piesat.weekendatthewaldorf.uis.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
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
import cn.piesat.weekendatthewaldorf.nets.Api;
import cn.piesat.weekendatthewaldorf.nets.retrofit.RetrofitClient;
import cn.piesat.weekendatthewaldorf.uis.activites.MovieDetailActivity;
import cn.piesat.weekendatthewaldorf.uis.adapters.MovieTabsAdapter;
import cn.piesat.weekendatthewaldorf.utils.Constant;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {
    private static MovieFragment btlistFragment;
    private View view;
    private RecyclerView recyclerView;
    private Api api;
    private List<MovieNewMoviesEntity.SubjectsBean> movieNewList;
    private MovieTabsAdapter movieTabsAdapter;
    private String type;

    public static MovieFragment newInstance(String type) {
        btlistFragment = new MovieFragment();
        Bundle bundle = new Bundle();
        bundle.putString("Type", type);
        btlistFragment.setArguments(bundle);
        return btlistFragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_movie, container, false);
        initService();
        initView();
        ConfigRecyclerView();
        initData();
        return view;
    }

    private void initView() {
        recyclerView = view.findViewById(R.id.recycler_tabs_movie);
        Bundle bundle = getArguments();
        this.type = bundle.getString("Type");
    }

    private void initService() {
        api = new RetrofitClient().getMovieService();
    }

    private void initData() {
        Observable<MovieNewMoviesEntity> observable = api.getMovieNewMovies(Api.API_KEY);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MovieNewMoviesEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        ToastUtil.showToast(getContext(), "onSubscribe");
                    }

                    @Override
                    public void onNext(MovieNewMoviesEntity movie) {
                        movieNewList = new ArrayList<>();
                        movieNewList.addAll(movie.subjects);
                        movieTabsAdapter.setNewData(movieNewList);
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.showToast(getContext(), "onError" + e);
                    }

                    @Override
                    public void onComplete() {
                        ToastUtil.showToast(getContext(), "onComplete");
                    }
                });
    }

    private void ConfigRecyclerView() {
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        movieNewList = new ArrayList<>();
        movieTabsAdapter = new MovieTabsAdapter(movieNewList);
        recyclerView.setAdapter(movieTabsAdapter);
        movieTabsAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            private View post;

            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                post = view.findViewById(R.id.post_img);
                Intent intent = new Intent(getActivity(), MovieDetailActivity.class);
                intent.putExtra(Constant.KEY_MOVIE_ID, movieNewList.get(position).id);
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),
                                post, String.valueOf(R.string.transition_movie_img));
                ActivityCompat.startActivity(getActivity(), intent, options.toBundle());
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
