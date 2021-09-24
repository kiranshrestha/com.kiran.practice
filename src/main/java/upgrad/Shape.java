package upgrad;//Please do not change the class names provided, and edit only the indicated sections.

import java.util.ArrayList;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    protected abstract double getArea();

    protected double getPerimeter() {
        return (side1+side2+side3+side4);
    }
}

// Implement the Parallelogram class
class Parallelogram extends Quadrilateral{
    double height;
    public Parallelogram(double side1, double side2, double height) {
        super(side1, side2, side1, side2);
        this.height = height;
    }

    @Override
    protected double getArea() {
        return height*side1;
    }
}

// Implement the Rhombus class
class Rhombus extends Quadrilateral{
    double height;
    public Rhombus(double side, double height) {
        super(side, side, side, side);
        this.height = height;
    }

    @Override
    protected double getArea() {
        return side1* height;
    }
}

// Implement the Rectangle class
class Rectangle extends Quadrilateral{
    public Rectangle(double length, double breadth) {
        super(length,breadth,length, breadth);
        // Implement the Parallelogram class
    }

    @Override
    protected double getArea() {
        return side1*side2;
    }
}

// Implement the Square class
class Square extends Quadrilateral{
    public Square(double side) {
        super(side,side,side,side);
    }

    @Override
    protected double getArea() {
        return  side1*side1;
    }
}


public class Shape {
    public static void main(String[] args) {
        ArrayList mix = new ArrayList();
        mix.add("Hari");
        mix.add(2);
        printMixList(mix);




        /*Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, height);
        System.out.println("Parallelogram Perimeter: " + parallelogram.getPerimeter());
        System.out.println("Parallelogram Area: " + parallelogram.getArea());

        //Rhombus
        double side = scan.nextDouble();
        height = scan.nextDouble();
        Rhombus rhombus = new Rhombus(side, height);
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());
        System.out.println("Rhombus Area: " + rhombus.getArea());

        //Rectangle
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        //Square
        side = scan.nextDouble();
        Square square = new Square(side);
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Area: " + square.getArea());

        scan.close();*/
    }
    // Do not edit the Test class
    public static void printMixList(ArrayList elements) {
        for (Object o : elements) {
            System.out.println(o);
        }
    }
}

interface bookTickets {
    int number = 0;

    default void addSeat() {
        System.out.println("This is default.");
    }

    void display();
    ArrayList<Integer> std = new ArrayList<>();
}

class A {
    public void display() {
        double i = 99.99;
        System.out.println(i);
    }
}

class B extends A {
    public void display() {
        double i = 100;
        super.display();
    }
}

abstract class Parent {

    abstract int display(int i);

    int returnValue(int i) {
        return display(++i);
    }
}

class Child extends Parent {
    int display(int i) {
        return ++i;
    }
}


