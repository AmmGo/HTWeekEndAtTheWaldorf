package cn.piesat.weekendatthewaldorf.uis.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.leochuan.AutoPlayRecyclerView;
import com.leochuan.CarouselLayoutManager;
import com.leochuan.ViewPagerLayoutManager;

import net.arvin.baselib.base.BaseFragment;
import net.arvin.baselib.utils.ToastUtil;

import java.util.ArrayList;
import java.util.List;

import cn.piesat.weekendatthewaldorf.R;
import cn.piesat.weekendatthewaldorf.entities.movie.FilmsEntity;
import cn.piesat.weekendatthewaldorf.nets.Api;
import cn.piesat.weekendatthewaldorf.nets.retrofit.RetrofitClient;
import cn.piesat.weekendatthewaldorf.uis.adapters.BannerAdapter;
import cn.piesat.weekendatthewaldorf.uis.adapters.HomeTabFragmentPagerAdapter;
import cn.piesat.weekendatthewaldorf.utils.Util;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import jp.wasabeef.glide.transformations.BlurTransformation;


/**
 * @author yjl WeekendAtTheWaldorf
 * @name HomeFragment
 * @class name：cn.piesat.weekendatthewaldorf.uis.fragments
 * @class describe
 * @time 2019/1/17 19:57
 * @change
 * @chang time
 * @class describe
 */
public class HomeFragment extends BaseFragment {
    private List<FilmsEntity.SubjectsBean> films;
    private Api api;
    private AutoPlayRecyclerView banner;
    private CarouselLayoutManager carouselLayoutManager;
    private BannerAdapter bannerAdapter;
    private ImageView imgBannerBg;
    private int bgNum;
    private com.antiless.support.widget.TabLayout homeTabView;
    private ViewPager homepager;

    @Override
    protected int getContentView() {
        return R.layout.fragment_home;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        initService();
        banner = root.findViewById(R.id.recycler);
        imgBannerBg = root.findViewById(R.id.img_bg);
        homeTabView = root.findViewById(R.id.home_tabs);
        homepager = root.findViewById(R.id.homepager);
        initTabs();
        ConfigBannerView();
        filmData();

    }

    private void initTabs() {
        MovieFragment movieFragment = MovieFragment.newInstance("movie");
        SerialFragment serisFragment = SerialFragment.newInstance("seris");
        List listfragment = new ArrayList<Fragment>();
        listfragment.add(movieFragment);
        listfragment.add(serisFragment);
        FragmentManager fm = getChildFragmentManager();
        HomeTabFragmentPagerAdapter adapter = new HomeTabFragmentPagerAdapter(fm, listfragment);
        homepager.setAdapter(adapter);
        homepager.setCurrentItem(0);
        homeTabView.setupWithViewPager(homepager);
    }

    private void filmData() {
        Observable<FilmsEntity> observable = api.getMovieInTheaters(Api.API_KEY);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FilmsEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        ToastUtil.showToast(getContext(), "dieng");
                    }

                    @Override
                    public void onNext(FilmsEntity movie) {
                        films = new ArrayList<>();
                        films.addAll(movie.subjects);
                        bannerAdapter.setNewData(films);
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

    private void initService() {
        api = new RetrofitClient().getMovieService();
    }

    private void ConfigBannerView() {
        carouselLayoutManager = new CarouselLayoutManager(getContext(), Util.Dp2px(getContext(), 100));
        carouselLayoutManager.setItemSpace(Util.Dp2px(getContext(), 80));
        carouselLayoutManager.setMoveSpeed(0.3f);
        banner.setLayoutManager(carouselLayoutManager);
        films = new ArrayList<>();
        bannerAdapter = new BannerAdapter(films);
        banner.setAdapter(bannerAdapter);
        carouselLayoutManager.setOnPageChangeListener(new ViewPagerLayoutManager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int i) {
                if (i == 0) {
                    bgNum = 0;
                } else if (i == films.size() - 1) {
                    bgNum = films.size() - 1;
                } else {
                    bgNum = i + 1;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {
                RequestOptions options = RequestOptions.bitmapTransform(new BlurTransformation(14, 3));
                Glide.with(getContext()).load(films.get(bgNum).images.medium).apply(options).into(imgBannerBg);

            }
        });
    }
}
