package upgrad.InheritenceNPolymorphism;

import java.util.*;

class Number {
    //Write your code here
    private final double realNo;
    private final double imaginaryNo;

    public Number(double realNo, double imaginaryNo) {
        this.realNo = realNo;
        this.imaginaryNo = imaginaryNo;
    }

    public double getImaginaryPart() {
        //Write your code here
        return imaginaryNo;
    }

    public double getRealNo() {
        return realNo;
    }
}

class Complex extends Number {
    public Complex(double realNo, double imaginaryNo) {
        super(realNo, imaginaryNo);
    }
    //Write your code here
    public void checkComplex(){
        String complexCheck;
        if(getImaginaryPart()==0){
            complexCheck = "The given number is real";
        }else
            complexCheck = "The given number is complex";
        System.out.println(complexCheck);
    }
}

class PurelyImaginary extends Complex {

    //Write your code here
    public PurelyImaginary(double realNo, double imaginaryNo) {
        super(realNo,imaginaryNo);
    }
    public void checkPurelyImaginaryNumber(){
        String complexCheck;
        if(getRealNo()==0 && getImaginaryPart()!=0)
            complexCheck = String.format("i%.1f\n%s",getImaginaryPart(),"The number is purely imaginary");
        else
            complexCheck = String.format("%.1f+i%.1f\n%s",getRealNo(),getImaginaryPart(),"The number is not purely imaginary");
        System.out.println(complexCheck);
    }
}

public class NumberSystemAndInheritance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();

    }
}


