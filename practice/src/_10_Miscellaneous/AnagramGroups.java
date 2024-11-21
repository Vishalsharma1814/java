package _10_Miscellaneous;

import java.util.*;

public class AnagramGroups {

    public static List<List<String>> groupAnagrams(String[] words) {
        // Map to group anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            // Sort the word to generate a key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Add the word to the map
            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Return the grouped anagrams
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "cat", "act"};

        List<List<String>> groupedAnagrams = groupAnagrams(words);

        // Print the result
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}

