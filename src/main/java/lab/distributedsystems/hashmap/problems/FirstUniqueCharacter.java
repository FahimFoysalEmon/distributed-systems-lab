package lab.distributedsystems.hashmap.problems;

import java.util.HashMap;

public class FirstUniqueCharacter {

    public FirstUniqueCharacter(String word) {

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (!freq.containsKey(c)) {
                freq.put(c, 1);
            } else  {
                freq.put(c, freq.get(c) + 1);
            }

        }

        System.out.println("Frequency for First Unique: " + freq);

        int min = 1;

        for (int i = 0; i<word.length() ; i++) {

            char c = word.charAt(i);

            if (freq.get(c) == min) {
                System.out.println("First Unique: " + c);
                return;
            }

        }


    }

}
