package lab4Package;
import lab4Package.NewException;
import lab4Package.NotEmpty;
import lab4Package.DividedByZero;

public class ThreeMethod {
public ThreeMethod(){}
   public int methodCalc(int x,int y) throws DividedByZero {
   if (y==0){
 throw new DividedByZero ("Cant divided by zero");
      }
   return x/y;
   }
   
   public void printName(int x,String name) throws NewException{
   int size =5;
    if (x>size) {
 throw new NewException ("Out of limit");
     }
    for (int i =0; i<size;i++){
    System.out.println(name);
    }
   
   }
   
   public void numberOfCaracter (String name) throws NotEmpty{
   
   if (name.length() ==0){
  throw new NotEmpty("Cant be empty ");
   }
   }
};
