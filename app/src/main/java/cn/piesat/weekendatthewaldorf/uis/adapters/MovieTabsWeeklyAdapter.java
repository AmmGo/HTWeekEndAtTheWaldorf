package cn.piesat.weekendatthewaldorf.uis.adapters;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cn.piesat.weekendatthewaldorf.R;
import cn.piesat.weekendatthewaldorf.entities.movie.MovieNewMoviesEntity;
import cn.piesat.weekendatthewaldorf.entities.movie.MovieWeeklyEntity;

public class MovieTabsWeeklyAdapter extends BaseQuickAdapter<MovieWeeklyEntity.SubjectsBean, BaseViewHolder> {
    public MovieTabsWeeklyAdapter(@Nullable List<MovieWeeklyEntity.SubjectsBean> data) {
        super(R.layout.item_tabs_movie, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MovieWeeklyEntity.SubjectsBean item) {
        helper.setText(R.id.post_title, item.subject.title);
        Glide.with(mContext).load(item.subject.images.large).into((ImageView) helper.getView(R.id.post_img));

    }
}
