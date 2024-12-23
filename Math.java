import lab3Package.*;

public class Math {
    public static void main(String[] args) {
    if (args.length != 3 ){
     System.out.println("please insert 3 inputs");
     return ;}
     double a =Double.parseDouble(args[0]);
     double b = Double.parseDouble(args[1]);
     double c = Double.parseDouble(args[2]);
     try{
Cover solve = new Cover();
  double [] result = solve.getRoot(a,b,c);
  System.out.println("First root = " + result[0] + "Second root = " + result[1]);
        }
        catch (Exception e){
        System.out.println(e.getMessage());}
}
}
