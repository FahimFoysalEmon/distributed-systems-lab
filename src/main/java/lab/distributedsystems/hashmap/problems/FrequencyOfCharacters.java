package lab.distributedsystems.hashmap.problems;

import lab.distributedsystems.hashmap.PhoneBook;

import java.util.HashMap;

public class FrequencyOfCharacters {

    public FrequencyOfCharacters(PhoneBook phoneBook, String key){
        System.out.println("FULL KEY - "+key);
        System.out.println("FULL VALUE - "+phoneBook.getContact(key));


        HashMap<String, Integer> frequency = new HashMap<>();

        System.out.println("ONE BY ONE CHARACTERS\n");
        for (int i = 0; i < key.length(); i++) {

            char c  = key.charAt(i);
            frequency.put(c+"",1);

            if (key.charAt(i) == c) {

            }
        }

    }

}
