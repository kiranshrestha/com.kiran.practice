package upgrad.abstraction;


import java.util.*;

abstract class Homeloan {
    double amount;
    int time;

    public Homeloan(double amount, int time) {
        this.amount = amount;
        this.time = time;
    }

    //Write your code here
    abstract double simpleInterest();

}

class Bank1 extends Homeloan {
    public Bank1(double amount, int time) {
        super(amount,time);
    }

    //Write your code here
    @Override
    double simpleInterest() {

        //Write your code here
        return (amount*time*7.2)/100;
    }

}

class Bank2 extends Homeloan {
    public Bank2(double amount, int time) {
        super(amount, time);
    }

    //Write your code here
    @Override
    double simpleInterest() {

        //Write your code here
        return (amount*time*8.1)/100;
    }



}



class BankLoanService {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        Bank1 obj1 = new Bank1(amount, time);
        Bank2 obj2 = new Bank2(amount, time);
        if(amount<0){
            System.out.println("invalid input");
            return;
        }
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest()+ obj1.amount);
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest()+ obj2.amount);
        }
    }

    static double getSimpleInterest(double amount, int time, double rate) {
        return (amount*time*rate)/100;
    }

}


