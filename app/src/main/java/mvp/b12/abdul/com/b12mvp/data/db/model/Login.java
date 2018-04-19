package mvp.b12.abdul.com.b12mvp.data.db.model;

/**
 * Created by Ansari on 4/19/2018.
 */

public class Login {
    String name;
    String password;

    public Login(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
