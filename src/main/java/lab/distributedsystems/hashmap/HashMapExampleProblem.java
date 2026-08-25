package lab.distributedsystems.hashmap;

import java.util.HashMap;

public class HashMapExampleProblem {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Emon", "01683149665");
        phoneBook.add("Joy", "01532460014");
        phoneBook.add("Adnan", "01732900735");
        phoneBook.add("Anik", "01312862023");
        phoneBook.add("Rakib", "01653000881");
        phoneBook.add("Nadia", "01759568060");
        phoneBook.add("Mitu", "01748683939");
        phoneBook.add("Sabbir", "01693241971");
        phoneBook.add("Rifat", "01484983544");
        phoneBook.add("Fahim", "01596308009");


        // to get a single value from a hashmap
        System.out.println(phoneBook.getContact("Emon"));

        // to get all values from a hashmap
        phoneBook.getContacts().forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

    }

}
