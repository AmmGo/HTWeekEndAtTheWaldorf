package cn.piesat.weekendatthewaldorf.nets.retrofit;

import cn.piesat.weekendatthewaldorf.nets.Api;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Tnno Wu on 2018/01/30.
 */

public class RetrofitClient {

    public Api getMovieService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        return retrofit.create(Api.class);
    }
}
