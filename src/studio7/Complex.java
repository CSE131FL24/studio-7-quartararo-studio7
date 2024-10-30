package studio7;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex((this.real + other.real), (this.imaginary + other.imaginary));
    }

    public Complex multiply(Complex other) {
        return new Complex(((this.real*other.real) - this.imaginary*other.imaginary), ((this.real*other.imaginary) + other.real*this.imaginary));
    }

    public static void main(String[] args) {
        Complex test1 = new Complex(1, 2);
        Complex test2 = new Complex(3, 5);

        System.out.println(test1.add(test2));
        System.out.println(test1.multiply(test2));
    }
}
