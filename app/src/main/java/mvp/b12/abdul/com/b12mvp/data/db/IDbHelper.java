package mvp.b12.abdul.com.b12mvp.data.db;

import mvp.b12.abdul.com.b12mvp.data.db.model.Login;

/**
 * Created by Ansari on 4/19/2018.
 */

public interface IDbHelper {
    public void openDb();
    public void closeDb();

    void createRow(Login login);

    public void readRow();
    public void readAllRows();
    public void updateRow();
    public void deleteRow();
}
