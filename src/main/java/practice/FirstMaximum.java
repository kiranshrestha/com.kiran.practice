package practice;

import java.util.Scanner;

public class FirstMaximum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i< num ; i++){
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        int maxPos = 0;
        for(int i = 0; i< num; i++){
            if(max<arr[i])
            {
                maxPos = i;
                max = arr[i];
            }
        }
        System.out.println(maxPos);
    }
}
