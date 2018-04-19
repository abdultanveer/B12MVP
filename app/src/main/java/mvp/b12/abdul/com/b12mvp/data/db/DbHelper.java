package mvp.b12.abdul.com.b12mvp.data.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import mvp.b12.abdul.com.b12mvp.data.db.model.LoginContract.LoginEntry;


import mvp.b12.abdul.com.b12mvp.data.db.model.Login;
import mvp.b12.abdul.com.b12mvp.data.db.model.LoginContract;

/**
 * Created by Ansari on 4/19/2018.
 */

public class DbHelper implements IDbHelper {
    public static final String TAG = DbHelper.class.getSimpleName();

    SQLiteDatabase database;
    DbOpenHelper openHelper;
    public DbHelper(Context context){
        openHelper = new DbOpenHelper(context);
    }

    @Override
    public void openDb() {
        database = openHelper.getWritableDatabase();
    }

    @Override
    public void closeDb() {
        database.close();
    }

    @Override
    public void createRow(Login login) {
        ContentValues values = new ContentValues();
        values.put(LoginEntry.COLUMN_NAME_TITLE, login.getName() );
        values.put(LoginEntry.COLUMN_NAME_PASSWORD, login.getPassword() );

        database.insert(LoginEntry.TABLE_NAME,null,values);
        Log.i(TAG,"insert db row");

    }

    @Override
    public void readRow() {

    }

    @Override
    public void readAllRows() {

    }

    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {

    }
}
