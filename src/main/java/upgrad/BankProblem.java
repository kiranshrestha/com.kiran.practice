package upgrad;

import java.util.*;

class SavingAmount {
    private int saving;
    public void setInitialSaving(int saving) {
        this.saving = saving;
    }

    public void decrementSaving() {
        this.saving -= 100;
    }

    public void incrementSaving() {
        this.saving += 1000;
    }

    public void checkSaving() {
        String savingStatus;
        if(saving>=1000){
             savingStatus= "Congratulations! You have saved a good amount";
        }else if(saving<1000 && saving>=0){
            savingStatus= "Insufficient saving!";
        }else{
            savingStatus= "You are in debt";
        }
        System.out.println(savingStatus);
    }

    public String getCurrentSaving() {
        return String.valueOf(saving);
    }
//write your code here
}

class BankProblem {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs " + obj.getCurrentSaving());
    }
    private class A{
        private class b{
            private class c{

            }
        }
    }
}



