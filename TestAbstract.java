
abstract class GeometricObject {
    private String color;
    private boolean filled;
    
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() { return color; }
    public boolean isFilled() { return filled; }
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
    private double side1, side2, side3;
    
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    public void display() {
        System.out.println("The Area is " + getArea());
        System.out.println("The Perimeteris " + getPerimeter());
        System.out.println("TringleNew: Side1 = "+ side1+" Side2 = "+side2+" Side 3 = "+side3);
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        System.out.print("Enter the color: ");
        String color = input.next();
        
        System.out.print("Enter a boolean value for filled: ");
        boolean filled = input.nextBoolean();
        
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        triangle.display();
    }
}
