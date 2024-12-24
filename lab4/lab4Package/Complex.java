package lab4Package;
public class Complex<T extends Number> {
    private T real;  
    private T imaginary;  
    public Complex(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public T getReal() {
        return real;
    }
    public void setReal(T real) {
        this.real = real;
    }
    public T getImaginary() {
        return imaginary;
    }
    public void setImaginary(T imaginary) {
        this.imaginary = imaginary;
    }
    public Complex<T> add(Complex<T> other) {
        T newReal = (T) new Double(this.real.doubleValue() + other.real.doubleValue());
        T newImaginary = (T) new Double(this.imaginary.doubleValue() + other.imaginary.doubleValue());
        return new Complex<>(newReal, newImaginary);
    }
    public Complex<T> subtract(Complex<T> other) {
        T newReal = (T) new Double(this.real.doubleValue() - other.real.doubleValue());
        T newImaginary = (T) new Double(this.imaginary.doubleValue() - other.imaginary.doubleValue());
        return new Complex<>(newReal, newImaginary);
    }
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

