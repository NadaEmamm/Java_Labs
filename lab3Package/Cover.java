package lab3Package;

public class Cover implements Root{

public double[] getRoot(double a,double b,double c){
 double firstRoot;
 double secondRoot;
 if (a==0)
 throw new RuntimeException("First input must be not equal zero,we cant divided by zero");
 
 double getDiscriminant = (b * b) - (4 * a * c);
 
if (getDiscriminant < 0)
throw new RuntimeException("It will return complex number");
 else if(getDiscriminant == 0)
 firstRoot = secondRoot = -b / (2*a);
 
 else {
 firstRoot =(-b + Math.sqrt(getDiscriminant)) / (2 * a);
 secondRoot=(-b - Math.sqrt(getDiscriminant))/ (2 * a);
 }
  double [] result ={firstRoot,secondRoot};
 return result;

 }


