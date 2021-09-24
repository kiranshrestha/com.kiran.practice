package practice;

import java.util.Scanner;

public class BusTour {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hb = s.nextInt();
        int bridges = s.nextInt();
        boolean willNotCrash = true;
        for(int i =0; i< bridges; i++){
            int nextBridge=s.nextInt();
            if(hb>=nextBridge){
                System.out.printf("Will crash on bridge %d\n",i+1);
                willNotCrash = false;
                break;
            }
        }
        if(willNotCrash){
            System.out.println("Will not crash");
        }

    }

}
