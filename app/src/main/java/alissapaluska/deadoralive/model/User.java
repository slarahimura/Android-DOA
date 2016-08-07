package alissapaluska.deadoralive.model;

/**
 * Created by ali on 8/7/16.
 */
public class User {
    String name;
    String email;

    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
