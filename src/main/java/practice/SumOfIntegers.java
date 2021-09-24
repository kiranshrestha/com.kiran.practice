package practice;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = s.nextInt();
        int max = s.nextInt();
        int sum=0;
        while (min<=max){
            sum+= min++;
        }
        System.out.println(sum);
    }
}
