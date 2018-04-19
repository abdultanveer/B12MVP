package mvp.b12.abdul.com.b12mvp.ui.login;

import android.view.View;

import mvp.b12.abdul.com.b12mvp.data.db.model.Login;

/**
 * Created by Ansari on 4/19/2018.
 */

public interface IPresenter {
     public void    onButtonClicked(View v, Login login);
}
