package cn.piesat.weekendatthewaldorf.uis.activites;

import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.BindView;
import cn.piesat.weekendatthewaldorf.R;
import cn.piesat.weekendatthewaldorf.base.BaseActivity;
import cn.piesat.weekendatthewaldorf.entities.movie.MovieSubjectInfoEntity;
import cn.piesat.weekendatthewaldorf.nets.Api;
import cn.piesat.weekendatthewaldorf.nets.retrofit.RetrofitClient;
import cn.piesat.weekendatthewaldorf.uis.view.LoadDataView;
import cn.piesat.weekendatthewaldorf.utils.Constant;
import cn.piesat.weekendatthewaldorf.utils.StringFormatUtil;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import jp.wasabeef.glide.transformations.BlurTransformation;

public class MovieDetailActivity extends BaseActivity {
    private static final String TAG = "MovieDetail";
    // 这个是高斯图背景的高度
    private int imageBgHeight;
    private Api api;
    private String movieID;
    @BindView(R.id.img_item_bg)
    ImageView itemBg;
    @BindView(R.id.iv_one_photo)
    ImageView ivOnePhoto;
    @BindView(R.id.tv_one_rating_rate)
    TextView oneRatingRate;
    @BindView(R.id.tv_one_rating_number)
    TextView oneRatingNumber;
    @BindView(R.id.tv_one_directors)
    TextView oneDirectors;
    @BindView(R.id.tv_one_casts)
    TextView oneCasts;
    @BindView(R.id.tv_one_genres)
    TextView oneGenres;
    @BindView(R.id.tv_one_day)
    TextView oneDay;
    @BindView(R.id.tv_one_city)
    TextView oneCity;
    @BindView(R.id.tv_one_title)
    TextView oneTitle;
    @BindView(R.id.tv_one_synopsis)
    TextView oneSynopsis;
    @BindView(R.id.title_tool_bar)
    Toolbar titleToolBar;
    @BindView(R.id.iv_title_head_bg)
    ImageView ivTitleHeadBg;

    private void initService() {
        api = new RetrofitClient().getMovieService();
    }

    /**
     * 电影条目信息
     */
    private void initMovieSubjectInfoData() {
        Observable<MovieSubjectInfoEntity> observable = api.getMovieSubjectInfo(
                movieID,
                Api.API_KEY
        );
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MovieSubjectInfoEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "onSubscribe: ");
                    }

                    @Override
                    public void onNext(MovieSubjectInfoEntity movieSubjectInfoBean) {
                        setTitleBar(movieSubjectInfoBean);
                        //背景图片
                        RequestOptions options = RequestOptions.bitmapTransform(new BlurTransformation(23, 4));
                        Glide.with(MovieDetailActivity.this).load(movieSubjectInfoBean.images.medium).apply(options).into(itemBg);
                        //小图片
                        Glide.with(MovieDetailActivity.this).load(movieSubjectInfoBean.images.large).into(ivOnePhoto);
                        //评分
                        oneRatingRate.setText("评分：" + String.valueOf(movieSubjectInfoBean.rating.average));
                        //评分人
                        oneRatingNumber.setText(movieSubjectInfoBean.collect_count + "人评分");
                        //导演
                        oneDirectors.setText(StringFormatUtil.formatName(movieSubjectInfoBean.directors));
                        //演员
                        oneCasts.setText(StringFormatUtil.formatCasts(movieSubjectInfoBean.casts));
                        //类型
                        oneGenres.setText(StringFormatUtil.formatGenres(movieSubjectInfoBean.genres));
                        //上映日期
                        oneDay.setText("上映日期：" + movieSubjectInfoBean.year);
                        // 制片国家
                        oneCity.setText("上映日期：" + "制片国家/地区：" + StringFormatUtil.formatGenres(movieSubjectInfoBean.countries));
                        // 另称
                        oneTitle.setText(StringFormatUtil.formatGenres(movieSubjectInfoBean.aka));
                        // 简介
                        oneSynopsis.setText(movieSubjectInfoBean.summary);

                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_movie_detail;
    }

    @Override
    protected ViewGroup loadDataViewLayout() {
        return null;
    }

    /**
     * toolbar设置
     */
    private void setTitleBar(MovieSubjectInfoEntity movieSubjectInfoBean) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            // 透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        setSupportActionBar(titleToolBar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //去除默认Title显示
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_back);
        }
        // 手动设置才有效果
        titleToolBar.setTitleTextAppearance(this, R.style.ToolBar_Title);
        titleToolBar.setSubtitleTextAppearance(this, R.style.Toolbar_SubTitle);

        titleToolBar.setTitle(movieSubjectInfoBean.title);
        titleToolBar.setSubtitle(String.format("主演：%s", StringFormatUtil.formatCasts(movieSubjectInfoBean.casts)));

//        titleToolBar.inflateMenu(R.menu.movie_detail);
//        titleToolBar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.actionbar_more));
//        titleToolBar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onBackPressed();
//            }
//        });

//        binding.titleToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.actionbar_more:// 更多信息
//                        WebViewActivity.loadUrl(MovieDetailActivity.this, mMoreUrl, mMovieName);
//                        break;
//                }
//                return false;
//            }
//        });
    }

    @Override
    protected void initView() {
        movieID = getIntent().getStringExtra(Constant.KEY_MOVIE_ID);
        initService();
        initMovieSubjectInfoData();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void getLoadView(LoadDataView loadView) {

    }

    @Override
    protected void initPresenter() {

    }
}
