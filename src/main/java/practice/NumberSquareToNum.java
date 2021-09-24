package practice;

import java.util.Scanner;

public class NumberSquareToNum {
        public static void main(String[] args) {
            // put your code here
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            int sum = 0;
            int i = 1;
            while(num>=sum) {
                sum = i*i;
                if(num>=sum)
                    System.out.println(sum);
                else
                    break;
                i++;
            }
        }

}
