package mvp.b12.abdul.com.b12mvp.ui.login;

import android.view.View;

import mvp.b12.abdul.com.b12mvp.data.db.IDbHelper;
import mvp.b12.abdul.com.b12mvp.data.db.model.Login;

/**
 * Created by Ansari on 4/19/2018.
 */

public class Presenter implements IPresenter {
    //Context mContext;
    IView iView;
    IDbHelper iDbHelper;

    public Presenter(MainActivity activity){
        //mContext = context;
        iView = activity;
    }


    @Override
    public void onButtonClicked(View v, Login login) {
        iView.showToast();
        // connect with datamanager ask him to push this login data to db
        iDbHelper.openDb();
        iDbHelper.createRow(login);
        //presenter has to tell the view to paint results
       // Toast.makeText(mContext,"button clicked",Toast.LENGTH_SHORT).show();
    }
}
