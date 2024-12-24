import lab4Package.Complex;
public class Main1 {
    public static void main(String[] args) {

        Complex<Double> complex1 = new Complex<>(3.0, 2.0); 
        Complex<Double> complex2 = new Complex<>(1.0, 7.0); 
        System.out.println("complex1 = " +complex1 );
        System.out.println("complex2 = " +complex2 );
        Complex<Double> resultAdd = complex1.add(complex2);
        System.out.println("Addition: " + resultAdd);
        Complex<Double> resultSubtract = complex1.subtract(complex2);
        System.out.println("Subtraction: " + resultSubtract);
    }
}

