package studio7;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
 
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public boolean isSmallerThan(Rectangle other) {
        return this.getArea() < other.getArea();
    }

    public boolean isSquare() {
        return length == width;
    }

    public static void main(String[] args) {
        Rectangle test = new Rectangle(2, 2);

        System.out.println("Area: " + test.getArea());
        System.out.println("Perimeter: " + test.getPerimeter());
        System.out.println("Is square: " + test.isSquare());
    }
}
