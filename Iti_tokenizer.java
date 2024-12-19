import java.util.StringTokenizer;

public class Iti_tokenizer {
    public static void main(String[] args) {
        String sentance = "ITI develops people and ITI house of developers and ITI for people";
        int counter = 0;
        

        StringTokenizer newArray = new StringTokenizer(sentance," ");
        

        while (newArray.hasMoreTokens()) {
            String word = newArray.nextToken();
            if (word.equals("ITI")) {
                counter++;
            }
        }
        
        System.out.println("Number of 'ITI' in the sentence: " + counter);
    }
}
