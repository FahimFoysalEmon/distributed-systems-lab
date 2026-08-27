package lab.distributedsystems.hashmap.problems;

import java.util.HashMap;

public class WordFrequency {

    public WordFrequency(String word) {

        HashMap<String, Integer> freq = new HashMap<>();

        int wordCount = word.split(" ").length;

        for (int i = 0; i < wordCount; i++) {

            if (!freq.containsKey(word.split(" ")[i])) {
                freq.put(word.split(" ")[i], 1);
            } else {
                freq.put(word.split(" ")[i], freq.get(word.split(" ")[i]) + 1);
            }
        }

        System.out.println("Word Frequency: " + freq);


    }


}
