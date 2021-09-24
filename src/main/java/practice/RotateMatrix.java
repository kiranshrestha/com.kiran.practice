package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i< m ; i++){
            ArrayList<Integer> innerArr= new ArrayList<>();
            arr.add(innerArr);
            for(int j = 0; j< n ; j++){
                innerArr.add(s.nextInt());
            }
        }
        System.out.println(arr);

        int[][] newArr = new int[n][m];
        for(int i = 0; i< m; i++) {
            for(int j= 0; j< n; j++){
                newArr[j][i] = arr.get(i).get(j);
            }
        }
        System.out.println(Arrays.deepToString(newArr));
    }
}
