package lab.distributedsystems.hashmap.problems;

import lab.distributedsystems.hashmap.PhoneBook;

import java.util.HashMap;

public class FrequencyOfCharacters {

    public FrequencyOfCharacters(PhoneBook phoneBook, String key){
        System.out.println("FULL KEY - "+key);
        System.out.println("FULL VALUE - "+phoneBook.getContact(key));


        HashMap<Character, Integer> frequency = new HashMap<>();

        System.out.println("ONE BY ONE CHARACTERS\n");
        for (int i = 0; i < key.length(); i++) {

            char c  = key.charAt(i);

            if (!frequency.containsKey(c)) {
                frequency.put(c, 1);
            } else  {
                frequency.put(c, frequency.get(c)+1);
            }
        }

        System.out.println("Frequency "+frequency);

    }

}
