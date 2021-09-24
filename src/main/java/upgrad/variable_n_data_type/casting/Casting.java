package upgrad.variable_n_data_type.casting;

import java.util.Scanner;
public class Casting {

    public static void main(String[] args) {
        int a = 11;
        float f = 12.2345f;
        double d = 12.34567895343534611;

        Scanner input= new Scanner(System.in);

        a=input.nextInt();
        float x = (float)a;

        f=input.nextFloat();
        int y = (int)f;

        d=input.nextDouble();

        float z = (float)d;

        System.out.println (x);
        System.out.println (y);
        System.out.println (z);

    }
}
