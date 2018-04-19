package mvp.b12.abdul.com.b12mvp.ui.login;

import android.view.View;

/**
 * Created by Ansari on 4/19/2018.
 */

public class Presenter implements IPresenter {
    //Context mContext;
    IView iView;

    public Presenter(MainActivity activity){
        //mContext = context;
        iView = activity;
    }


    @Override
    public void onButtonClicked(View v) {
        iView.showToast();
        //presenter has to tell the view to paint results
       // Toast.makeText(mContext,"button clicked",Toast.LENGTH_SHORT).show();
    }
}
