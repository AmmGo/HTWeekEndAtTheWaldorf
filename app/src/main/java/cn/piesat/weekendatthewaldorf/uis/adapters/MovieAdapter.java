package cn.piesat.weekendatthewaldorf.uis.adapters;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cn.piesat.weekendatthewaldorf.R;
import cn.piesat.weekendatthewaldorf.entities.movie.FilmsEntity;

public class MovieAdapter extends BaseQuickAdapter<FilmsEntity.SubjectsBean, BaseViewHolder> {
    public MovieAdapter(@Nullable List<FilmsEntity.SubjectsBean > data) {
        super(R.layout.item_movie, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, FilmsEntity.SubjectsBean item) {
        helper.setText(R.id.tv_movie_name, item.title);
        helper.setText(R.id.tv_description, item.genres.get(0));
        Glide.with(mContext).load(item.images.large).into((ImageView) helper.getView(R.id.img_movie));
    }
}
