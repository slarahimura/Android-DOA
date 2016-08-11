package alissapaluska.deadoralive.model;

import java.util.ArrayList;

/**
 * Created by ali on 8/11/16.
 */
public class Contact {
    String name;
    String number;
    String email;

    public Contact(String name, String email, String number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactsList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact("Person " + ++lastContactId, "janedoe@gmail.com", "1-503-678-1234"));
        }

        return contacts;
    }
}
