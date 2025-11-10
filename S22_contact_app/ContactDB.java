package S22_contact_app;

import java.util.HashMap;
import java.util.Map;

public class ContactDB {

    // private Map<String, Map<String, String>> db;
    private Map<String, String> db;

    public ContactDB() {
        db = new HashMap<>();
    }

    public boolean addContact(String name, String phoneNumber) {
        if (db.containsKey(name)) {
            // contact already exists
            System.out.println("Contact already exists");
            return false;
        } else {
            db.put(name, phoneNumber);
            return true;
        }

    }

    public boolean updateContact(String name, String phoneNumber) {
        if (db.containsKey(name)) {
            // contact already exists
            db.put(name, phoneNumber);
            return true;
        } else {
            return false;
        }

    }

    public String getContact(String name) {
        return db.get(name);
    }

    public boolean deleteContact(String name) {
        if (db.containsKey(name)) {
            // remove the contact if it exists
            db.remove(name);
            return true;
        }
        // return false if contact does not exist
        return false;
    }

    public Map<String, String> getAllContacts() {
        return db;
    }
}
