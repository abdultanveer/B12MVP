package mvp.b12.abdul.com.b12mvp.ui.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import mvp.b12.abdul.com.b12mvp.R;
import mvp.b12.abdul.com.b12mvp.data.db.model.Login;

/**
 * my mainactivity is a view
 * view should be as dumb as possible
 */

public class MainActivity extends AppCompatActivity implements IView {
    IPresenter iPresenter;
    EditText nameEdittext, passwordEdittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEdittext = findViewById(R.id.nameEditText);
        passwordEdittext = findViewById(R.id.passwordEditText);

        iPresenter = new Presenter(this);
    }

    public void clickHandler(View view) {
        //tell presenter that button was clicked..
        //because its the presenter who'll decide what needs to be done on click of this button
        Login login = new Login(nameEdittext.getText().toString(),
                passwordEdittext.getText().toString());
        iPresenter.onButtonClicked(view,login);

    }

    @Override
    public void showToast() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
    }
}
