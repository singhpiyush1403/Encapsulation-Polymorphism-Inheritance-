import java.util.Scanner;


class Shape {
    public void calculateArea() {
        System.out.println("Area is calculated differently for each shape.");
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        int choice = scanner.nextInt();

       
        Shape shape = null; 

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius); 
                break;

            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width); 
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

     
        if (shape != null) {
            shape.calculateArea();
        }

        scanner.close();
    }
}