public class Iti{

    public static void main(String[] args) {
     
     String sent ="ITI develops people and ITI house of developers and ITI for people";
     int counter=0;
     
    String [] search = sent.split(" ");
    int size = search.length;
    for(int i=0; i<size; i++){
    if(search[i].equals("ITI"))
    counter++;
    }
    
             System.out.println("Number of ITI word : " + counter); 
}
}
