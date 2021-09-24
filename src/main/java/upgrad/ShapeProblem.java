package upgrad;

import java.util.*;

//Write your code here

public class ShapeProblem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape1 obj = new Triangle();
        Shape1 obj1 = new Rectangle1();
        Shape1 obj2 = new Shape1();
        int numberOfSides = in.nextInt();
        switch (numberOfSides){
            case 0 : obj2.printShape1();
            break;
            case 3 : obj.printShape1();
            break;
            case 4 : obj1.printShape1();
            default: System.out.println("Enter a valid number of sides!");
        }
    }
}

class Shape1{
    int sides;
    void printShape1(){
        System.out.println("The Shape1 is a circle");
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}

class Triangle extends Shape1{
    void printShape1(){
        if(sides==0)
        System.out.println("The Shape1 is a Triangle");
    }
}

class Rectangle1 extends Shape1{
    void printShape1(){
        System.out.println("The Shape1 is a Rectangle1");
    }
}



