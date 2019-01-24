package cn.piesat.weekendatthewaldorf.nets;


import cn.piesat.weekendatthewaldorf.entities.movie.FilmsEntity;
import cn.piesat.weekendatthewaldorf.entities.movie.MovieNewMoviesEntity;
import cn.piesat.weekendatthewaldorf.entities.movie.MovieSubjectInfoEntity;
import cn.piesat.weekendatthewaldorf.entities.movie.MovieWeeklyEntity;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by arvinljw on 2018/10/31 14:43
 * Function：
 * Desc：
 */
public interface Api {

    String BASE_URL = "http://api.douban.com/v2/movie/";

    String API_KEY = "0b2bdeda43b5688921839c8ecb20399b";

    /**
     * 正在热映
     * <p>https://ghibliapi.herokuapp.com/films
     * apikey：固定值 0b2bdeda43b5688921839c8ecb20399b
     * city：所在城市，例如北京、上海等
     * start：分页使用，表示第几页
     * count：分页使用，表示数量
     * client：客户端信息。可为空
     * udid：用户 id。可为空
     * <p>
     * 简：https://api.douban.com/v2/movie/in_theaters?apikey=0b2bdeda43b5688921839c8ecb20399b
     * 全：https://api.douban.com/v2/movie/in_theaters?apikey=0b2bdeda43b5688921839c8ecb20399b&city=%E5%8C%97%E4%BA%AC&start=0&count=100&client=&udid=
     */
    @GET("in_theaters")
    Observable<FilmsEntity> getMovieInTheaters(@Query("apikey") String apikey);
    /**
     * 新片榜
     *
     * apikey：固定值 0b2bdeda43b5688921839c8ecb20399b
     * client：客户端信息。可为空
     * udid：用户 id。可为空
     *
     * 简：https://api.douban.com/v2/movie/new_movies?apikey=0b2bdeda43b5688921839c8ecb20399b
     * 全：https://api.douban.com/v2/movie/new_movies?apikey=0b2bdeda43b5688921839c8ecb20399b&client=&udid=
     */
    @GET("new_movies")
    Observable<MovieNewMoviesEntity> getMovieNewMovies(@Query("apikey") String apikey);
    /**
     * 口碑榜
     *
     * apikey：固定值 0b2bdeda43b5688921839c8ecb20399b
     * city：所在城市，例如北京、上海等
     * client：客户端信息。可为空
     * udid：用户 id。可为空
     *
     * 简：https://api.douban.com/v2/movie/weekly?apikey=0b2bdeda43b5688921839c8ecb20399b
     * 全：https://api.douban.com/v2/movie/weekly?apikey=0b2bdeda43b5688921839c8ecb20399b&city=%E5%8C%97%E4%BA%AC&client=&udid=
     */
    @GET("weekly")
    Observable<MovieWeeklyEntity> getMovieWeekly(@Query("apikey") String apikey);
    /**
     * 电影条目信息
     *
     * apikey：固定值 0b2bdeda43b5688921839c8ecb20399b
     * city：所在城市，例如北京、上海等
     * client：客户端信息。可为空
     * udid：用户 id。可为空
     *
     * 简：http://api.douban.com/v2/movie/subject/26004132?apikey=0b2bdeda43b5688921839c8ecb20399b
     * 全：http://api.douban.com/v2/movie/subject/26004132?apikey=0b2bdeda43b5688921839c8ecb20399b&city=%E5%8C%97%E4%BA%AC&client=&udid=
     */
    @GET("subject/{movieId}")
    Observable<MovieSubjectInfoEntity> getMovieSubjectInfo(@Path("movieId") String movieId,
                                                           @Query("apikey") String apikey);
}
