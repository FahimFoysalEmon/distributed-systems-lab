package lab.distributedsystems.hashmap;

import java.util.HashMap;

public class PhoneBook {

    private final HashMap<String, String> contacts = new HashMap<>();

    public void add(String name, String number) {
        contacts.put(name, number);
    }

    public String getContact(String name) {
        return contacts.get(name);
    }

    public HashMap<String, String> getContacts() {
        return contacts;
    }

}
