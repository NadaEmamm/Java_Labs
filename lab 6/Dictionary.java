import java.util.*;

public class Dictionary {
    private static Map<Character, List<String>> dictionary = new TreeMap<>();
    public static void add(String word) {
        char letter = word.charAt(0);
        if (dictionary.containsKey(letter)) {
            dictionary.get(letter).add(word);
        } else {
            List<String> words = new ArrayList<>();
            words.add(word);
            dictionary.put(letter, words);
        }
    }
    public static void printDictionary() {
        for (char letter : dictionary.keySet()) {
            System.out.println(letter + ": " + dictionary.get(letter));
        }
    }
    public static void printDictionaryWords(char letter) {
        List<String> words = dictionary.get(letter);
        if (words != null) {
            ListIterator<String> iterator = words.listIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            System.out.println("No words found for the letter " + letter);
        }
    }

    public static void main(String[] args) {

        Dictionary.add("apple");
        Dictionary.add("banana");
        Dictionary.add("apricot");
        Dictionary.add("blueberry");
        Dictionary.add("blueberry");
      
        Dictionary.printDictionary();


        System.out.println("Words starting with 'a':");
        Dictionary.printDictionaryWords('a');


        System.out.println("Words starting with 'b':");
        Dictionary.printDictionaryWords('b');
    }
}


