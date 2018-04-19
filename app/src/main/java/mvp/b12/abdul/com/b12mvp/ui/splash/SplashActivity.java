package mvp.b12.abdul.com.b12mvp.ui.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mvp.b12.abdul.com.b12mvp.R;

public class SplashActivity extends AppCompatActivity implements IView {
        ISplashPresenter iSplashPresenter;
    /**
     * show loading progress bar for 2 second and start login activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // tell presenter  that splash activity got created what should it do next
        //presenter will tell the activity to show progress bar while i am fetching the data [2sec]
        //presenter will tell the activity to start the mainactivity[login]
    }

    @Override
    protected void onStart() {
        super.onStart();
        iSplashPresenter.activityReady(this);
    }

    @Override
    public void showLoading() {
        //make progress bar visible
    }

    @Override
    public void hideLoading() {
        //hide the progress bar
    }
}
