package upgrad.abstraction;

abstract class HomeLoan1 {
    public HomeLoan1() {
        System.out.println("House 1");
    }

    abstract void numbers();
}

class Bank12 extends HomeLoan1 {
    public Bank12() {
        System.out.println("Bank12");
    }

    void numbers() {
        System.out.println("Rate of interest is 7.2");
    }
}

class Source {
    public static void main(String[] args) {
        int principalAmount = 80000;
        int duration = 2;
        float rate = 4f;
        float interest = (principalAmount*duration*rate)/100;
        System.out.printf("The Person has to pay %.2f interest amount i.e the person has to pay the total amount of %.2f",interest, principalAmount+interest);
    }
}
