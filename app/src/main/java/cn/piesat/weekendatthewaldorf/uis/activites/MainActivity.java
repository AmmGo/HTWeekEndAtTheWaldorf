package cn.piesat.weekendatthewaldorf.uis.activites;

import android.annotation.SuppressLint;
import android.os.Message;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.ViewGroup;

import net.arvin.baselib.utils.ToastUtil;
import net.arvin.baselib.utils.WeakHandler;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import cn.piesat.weekendatthewaldorf.R;
import cn.piesat.weekendatthewaldorf.base.BaseActivity;
import cn.piesat.weekendatthewaldorf.entities.events.ChangeNightMode;
import cn.piesat.weekendatthewaldorf.uis.fragments.MainFragment;
import cn.piesat.weekendatthewaldorf.uis.view.LoadDataView;

/**
 * @author yjl WeekendAtTheWaldorf
 * @name MainActivity
 * @class name：cn.piesat.weekendatthewaldorf.uis.activites
 * @class describe
 * @time 2019/1/17 19:57
 * @change
 * @chang time
 * @class describe
 */
public class MainActivity extends BaseActivity implements MainFragment.IDrawerToggle, WeakHandler.IHandle {
    private MainFragment mainFragment;
    private DrawerLayout layoutDrawer;

    private static final int MSG_QUIT = 0;
    private static final int TIME_QUIT = 2000;
    private WeakHandler handler;
    private boolean canQuit = false;

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected ViewGroup loadDataViewLayout() {
        return null;
    }

    @Override
    protected void initView() {
        EventBus.getDefault().register(this);
        handler = new WeakHandler((WeakHandler.IHandle) this);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        mainFragment = new MainFragment();
        fragmentTransaction.add(R.id.layout_main, mainFragment);
        fragmentTransaction.commit();
        layoutDrawer = findViewById(R.id.layout_drawer);
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void toggle() {
        @SuppressLint("RtlHardcoded")
        int leftDrawer = Gravity.LEFT;
        if (layoutDrawer.isDrawerOpen(leftDrawer)) {
            layoutDrawer.closeDrawer(leftDrawer);
        } else {
            layoutDrawer.openDrawer(leftDrawer);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void changeDarkMode(ChangeNightMode mode) {
        layoutDrawer.postDelayed(new Runnable() {
            @Override
            public void run() {
//                startActivity(new Intent(MainActivity.this, SettingActivity.class));
                overridePendingTransition(0, 0);
            }
        }, 5);
    }

    @Override
    public void onBackPressed() {
        if (!canQuit) {
            canQuit = true;
            ToastUtil.showToast(this, "再按一次返回键退出～");
            handler.sendEmptyMessageDelayed(MSG_QUIT, TIME_QUIT);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public void handleMessage(Message msg) {
        if (msg.what == 0) {
            canQuit = false;
        }
    }
}
