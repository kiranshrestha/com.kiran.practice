package upgrad.abstraction;

public class RectangleProblem {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(7.33f);
        r1.setBreadth(4.22f);
        r1.calculateArea();
    }
}
class Rectangle{
    private float length, breadth;

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public void setLength(float length) {
        this.length = length;
    }
    public void calculateArea(){
        System.out.println(this.length*this.breadth);
    }
}
