package alissapaluska.deadoralive.model;

import java.util.ArrayList;

/**
 * Created by ali on 8/7/16.
 */
public class User {
    String name;
    String email;
    ArrayList<Contact> userContacts;
    Boolean status;

    public User() {}

    public User(String name, String email, Boolean status) {
        this.name = name;
        this.email = email;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ArrayList<Contact> getUserContacts() {
        return userContacts;
    }
}
