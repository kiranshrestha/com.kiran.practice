package practice;

import java.util.Scanner;

public class PositiveNumberCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();

        System.out.printf("%s",(in>=0)?"YES":"No");

    }
}
