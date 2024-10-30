package studio7;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator + other.numerator;
        int newDenominator = this.denominator;

        if (this.denominator != other.denominator) {
            newDenominator = this.denominator * other.denominator;
        }

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction((this.numerator * other.numerator), (this.denominator * other.denominator)); 
    }

    public Fraction reciprocal() {
        return new Fraction(this.denominator, this.numerator);
    }

    public Fraction simplify() {
        int gcd = gcd(this.numerator, this.denominator);
        return new Fraction((this.numerator/gcd), (this.denominator/gcd));
    }

    public static int gcd(int p, int q) {
		if ((p % q) == 0) {
			return q;
		} else {
			return gcd(q, (p % q));
		}
	}

    public static void main(String[] args) {
        Fraction test1 = new Fraction(2, 4);
        Fraction test2 = new Fraction(1, 3);


        System.out.println(test1.add(test2));
        System.out.println(test1.multiply(test2));
        System.out.println(test1.reciprocal());
        System.out.println(test1.simplify());
    }


}
