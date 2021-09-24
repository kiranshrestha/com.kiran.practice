package upgrad;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);
        for (int j : arr) System.out.print(j + " ");
    }

    // Method to reverse the array
    static void reverseArray(int[] arr) {
        // Write your code here
        int leftIndex = 0, rightIndex = arr.length - 1;
        int temp;
        while (leftIndex < rightIndex) {
            temp = arr[leftIndex]; // Store value on temporary variable for swap.

            /*Swiping the value first element to last
            * i.e if we have 123456
            * on each iteration
            *
            * first loop 623451
            * second loop 653421
            * .
            * .
            * .
            * finally 654321
            * */
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;

            //updating index
            leftIndex++;
            rightIndex--;
        }
    }
}

class Source1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        reverseArrayList(list);
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }

    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        System.out.println("hlo");
    }
}
