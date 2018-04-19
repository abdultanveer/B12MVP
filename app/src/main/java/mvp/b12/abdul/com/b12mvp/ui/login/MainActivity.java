package mvp.b12.abdul.com.b12mvp.ui.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import mvp.b12.abdul.com.b12mvp.R;

/**
 * my mainactivity is a view
 * view should be as dumb as possible
 */

public class MainActivity extends AppCompatActivity implements IView {
    IPresenter iPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iPresenter = new Presenter(this);
    }

    public void clickHandler(View view) {
        //tell presenter that button was clicked..
        //because its the presenter who'll decide what needs to be done on click of this button
        iPresenter.onButtonClicked(view);
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
    }
}
