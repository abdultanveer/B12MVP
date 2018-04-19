package mvp.b12.abdul.com.b12mvp.ui.login;

import android.database.Cursor;
import android.view.View;

import mvp.b12.abdul.com.b12mvp.R;
import mvp.b12.abdul.com.b12mvp.data.DataManager;
import mvp.b12.abdul.com.b12mvp.data.IDataManager;
import mvp.b12.abdul.com.b12mvp.data.db.IDbHelper;
import mvp.b12.abdul.com.b12mvp.data.db.model.Login;

/**
 * Created by Ansari on 4/19/2018.
 */

public class Presenter implements IPresenter,IDbHelper.OnDataReceived {
    //Context mContext;
    IView iView;
    IDataManager iDataManager;
    public Presenter(MainActivity activity){
        //mContext = context;
        iView = activity;
        iDataManager = new DataManager();
    }


    @Override
    public void onButtonClicked(View v, Login login) {
        iDataManager.openDb();

        switch (v.getId()){

            case R.id.btn_login:
                iView.showToast();
                // connect with datamanager ask him to push this login data to db
                iDataManager.createRow(login);
                break;
            case R.id.btn_cancel:
                iDataManager.readRow(this);
                break;
        }


        //presenter has to tell the view to paint results
       // Toast.makeText(mContext,"button clicked",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(Cursor cursor) {
        //get sample text from cursor
        iView.setDbText("sample");
    }

    @Override
    public void onFailure() {

    }
}
