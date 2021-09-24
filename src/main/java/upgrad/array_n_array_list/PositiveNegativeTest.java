package upgrad.array_n_array_list;

import java.util.*;

public class PositiveNegativeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }

    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int[] arr) {
        // Write your code here
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(arr[0]);
        for(int x = 1; x<arr.length ; x++ ){
            if(checkForOppositeSign(a.get(0),arr[x]))
                {
                    a.add(arr[x]);
                } else{
                    b.add(arr[x]);
                }
        }

        if(a.size() == n){
            // check if array is all positive
            if(checkForOppositeSign(-1,a.get(0)))
            {
                printList(a);
                System.out.println("Array doesn't have positive numbers");
            }else {
                printList(a);
                System.out.println("Array doesn't have negative numbers");
            }
        } else{
            if(a.get(0)==arr[0])
            {
                printList(a);
                printList(b);
            }else{
                printList(b);
                printList(a);
            }
        }
    }

    private static void printList(ArrayList<Integer> a) {
        for (int item : a) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }

    private static boolean checkForOppositeSign(int firstItem, int arrItem) {
        /* ^ = bitwise exclusive OR
        * compares each bit of its first operand to the corresponding bit of the second operand.
        * If both bits are 1's or both bits are 0's,
        * the corresponding bit of the result is set to 0.
        * Otherwise, it sets the corresponding result bit to 1.
        * so result of this operator will be negative or positive accordingly if both are same sign
        *  */
        System.out.println(firstItem^arrItem);
        return (firstItem^arrItem)>=0;
    }
}

