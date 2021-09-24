package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BritishAmericanSpelling {
    static int counter = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.nextLine();
        for(int i =0 ; i< num ; i++){
            processString(s.nextLine());
        }
    }

    private static void processString(String nextLine) {
        String[] data = nextLine.trim().split("//n");
        System.out.println(Arrays.toString(data));
    }
}
