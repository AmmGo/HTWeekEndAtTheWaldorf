package cn.piesat.weekendatthewaldorf.base;

import android.app.Activity;
import android.util.Log;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import cn.piesat.weekendatthewaldorf.utils.SpHelper;


/**
 * @author yjl WeekendAtTheWaldorf
 * @name Application
 * @class name：cn.piesat.weekendatthewaldorf.base
 * @class describe
 * @time 2019/1/24 19:43
 * @change
 * @chang time
 * @class describe
 */
public class Application extends android.app.Application {
    private static Application singleton;
    public static Map<String, Activity> activityMap = new HashMap<String, Activity>();        //管理activity 的容器

    public static Application getIns() {
        return singleton;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        SpHelper.init(getApplicationContext());
        singleton = (Application) this.getApplicationContext();
    }
    //收集创建的Activity
    public static void putActivityInfoToMap(Activity activity) {
        if (activity != null) {
            String activityName = activity.getClass().getSimpleName();
            Log.i("info", "putActivity--->" + activityName);

            activityMap.put(activityName, activity);
        }
    }

    //移除activity
    public static void removeActivityInfoFromMap(Activity activity) {
        if (activity != null) {
            String activityName = activity.getClass().getSimpleName();
            Log.i("info", "removeActivity--->" + activityName);
            if (activityMap.containsKey(activityName)) {
                activityMap.remove(activityName);
            }
        }
    }

    //关闭所有界面
    public static void closeAllActivityByMap() {
        if (!activityMap.isEmpty()) {
            Collection<Activity> activities = activityMap.values();
            Iterator<Activity> it = activities.iterator();
            while (it.hasNext()) {
                Activity activity = it.next();
                String activityName = activity.getClass().getSimpleName();

                Log.i("info", "removeActivity--->" + activityName);

                activity.finish();
            }
        }

    }
}
