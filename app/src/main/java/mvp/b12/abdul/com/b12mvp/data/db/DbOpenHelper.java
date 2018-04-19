package mvp.b12.abdul.com.b12mvp.data.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import mvp.b12.abdul.com.b12mvp.data.db.model.LoginContract.LoginEntry;

/**
 * Created by Ansari on 4/19/2018.
 */

public class DbOpenHelper extends SQLiteOpenHelper {
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + LoginEntry.TABLE_NAME + " (" +
                    LoginEntry._ID + " INTEGER PRIMARY KEY," +
                    LoginEntry.COLUMN_NAME_ENTRY_ID + TEXT_TYPE + COMMA_SEP +
                    LoginEntry.COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP +
                    LoginEntry.COLUMN_NAME_PASSWORD+
                    " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + LoginEntry.TABLE_NAME;

    public DbOpenHelper(Context context) {
        super(context, "login", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
