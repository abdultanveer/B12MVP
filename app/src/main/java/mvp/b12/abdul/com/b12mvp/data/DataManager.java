package mvp.b12.abdul.com.b12mvp.data;

import mvp.b12.abdul.com.b12mvp.data.db.IDbHelper;
import mvp.b12.abdul.com.b12mvp.data.db.model.Login;

/**
 * Created by Ansari on 4/19/2018.
 */

public class DataManager implements IDataManager {

    IDbHelper iDbHelper;

    @Override
    public void openDb() {
        iDbHelper.openDb();
    }

    @Override
    public void closeDb() {
        iDbHelper.closeDb();

    }

    @Override
    public void createRow(Login login) {
        iDbHelper.createRow(login);
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
