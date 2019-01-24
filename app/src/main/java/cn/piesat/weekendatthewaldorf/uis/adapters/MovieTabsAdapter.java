package cn.piesat.weekendatthewaldorf.uis.adapters;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cn.piesat.weekendatthewaldorf.R;
import cn.piesat.weekendatthewaldorf.entities.movie.MovieNewMoviesEntity;

public class MovieTabsAdapter extends BaseQuickAdapter<MovieNewMoviesEntity.SubjectsBean, BaseViewHolder> {
    public MovieTabsAdapter(@Nullable List<MovieNewMoviesEntity.SubjectsBean> data) {
        super(R.layout.item_tabs_movie, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MovieNewMoviesEntity.SubjectsBean item) {
        helper.setText(R.id.post_title, item.title);
        Glide.with(mContext).load(item.images.large).into((ImageView) helper.getView(R.id.post_img));

    }
}
