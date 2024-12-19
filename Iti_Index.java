public class Iti_Index {
    public static void main(String[] args) {
        String sent = "ITI develops people and ITI house of developers and ITI for people";

        int counter = 0;
        int index = 0;
        
        while ((index = sent.indexOf("ITI", index)) != -1) {
            counter++;
            index += "ITI".length(); 
        }
        
             System.out.println("Number of ITI word : " + counter); 
    }
}
