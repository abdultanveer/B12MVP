package mvp.b12.abdul.com.b12mvp.ui.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mvp.b12.abdul.com.b12mvp.R;

public class SplashActivity extends AppCompatActivity {

    /**
     * show loading progress bar for 2 second and start login activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
