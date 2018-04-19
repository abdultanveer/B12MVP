package mvp.b12.abdul.com.b12mvp.ui.splash;

import android.content.Context;
import android.content.Intent;

import mvp.b12.abdul.com.b12mvp.ui.login.MainActivity;

/**
 * Created by Ansari on 4/19/2018.
 */

public class SplashPresenter implements ISplashPresenter{
    @Override
    public void activityReady(Context mContext)  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent  loginIntent = new Intent(mContext, MainActivity.class);
        mContext.startActivity(loginIntent);
    }
}
