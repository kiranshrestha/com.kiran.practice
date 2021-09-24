package upgrad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Source {
    public static void main(String[] args) throws FileNotFoundException {
        //maxPowerOfTwo();

        //minimumElementInArray();

        //stringTest();
        //System.out.println(uppercase("Welcome"));
        //findMeanFromFile();
        //printBackwards(new int[]{5,6,7,4,4,4,6,7,8,89,4,3,2});

        toLowerCase();
    }

    private static void toLowerCase() {
        int diff = 97 - 65;
        System.out.printf("N : %c",(char)((int)'N' + diff));
        /*
        int a = 97;
        while(a <=122){
            System.out.println((char)a);
            a++;
        }

        int b = 65;
        while(b <=90){
            System.out.println((char)b);
            b++;
        }*/
    }

    private static void findMeanFromFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\Arun Shrestha\\Downloads\\Course\\quiz_numbers.txt");
        Scanner input = new Scanner(file);
        int count = 0;
        int sum = 0;
        while(input.hasNext()){
            sum += input.nextInt();
            count++;
        }
        System.out.println((float)sum/count);
    }

    public static int lcm(int num1 , int num2){
        int lcm = (num1>num2) ? num1 : num2;
        while(true)
        {
            if(lcm%num1 == 0 && lcm%num2 == 0){
                break;
            }
            lcm++;
        }
        return lcm;
    }

    public static String uppercase(String string1) {
        string1.toUpperCase();
        return string1;
    }

    private static void stringTest() {
        StringBuilder warriorProfession = new StringBuilder("Dragon ");
        String warriorWeapon = "Sword";
        changeWarriorClass(warriorProfession, warriorWeapon);
        //warriorProfession = null;
        //warriorProfession.delete(0, 10);

        System.out.println("Warrior=" + warriorProfession + " Weapon=" + warriorWeapon);
    }
    static void changeWarriorClass(StringBuilder warriorProfession, String weapon) {
        warriorProfession.append("Knight");
        weapon = "Dragon " + weapon;
        warriorProfession = new StringBuilder();
        warriorProfession.append("hellow");
        System.out.println(warriorProfession);
    }

    private static void minimumElementInArray() {
        int min;
        int[] array = {156, 171, 260, 95, 244, 296, 137, 180, 198, 61, 70, 283, 276, 55,
                + 100, 59, 278, 191, 109, 110, 158, 206, 77, 279, 53, 117, 217, 214, 107, 99, 222,
                + 275, 179, 213, 199, 139, 174, 286, 176, 155, 237, 256, 251, 187, 249, 215, 211, 113,
                + 144, 50, 148, 49, 170, 236, 219, 106, 71, 263, 145, 231, 190, 165, 239, 41, 177, 297,
                + 184, 193, 287, 202, 161, 189, 79, 232, 154, 153, 208, 72, 143, 300, 233, 124, 75,
                + 277, 63, 130, 86, 242, 203, 116, 196, 289, 146, 273, 268, 56, 104, 173, 134, 194};
        min = array[0];
        // Write logic here
        for(int i = 1 ; i< array.length-1; i++ )
        {
            if(array[i+1] < min)
                min = array[i+1];
        }
            System.out.println("Minimum value: " + min);
    }

    private static void maxPowerOfTwo() {
        Scanner scan = new Scanner(System.in);
        // Enter the number
        int number = scan.nextInt();
        int result;
        int pow = 1;
        if(number >= 2) {
            while (true) {
                // Write the logic
                result = 1;
                for( int i = 1 ; i<= pow ; i++)
                {
                    result*=2;
                }
                if(result >number)
                {
                    result = result/2;
                    break;
                }
                else if( result == number)
                {
                    break;
                }
                pow++;
            }

            System.out.print(result);

        } else {
            System.out.print("Please enter an integer >= 2");
        }
        scan.close();
    }

    public static void printBackwards(int[] numbers) {
        for(int i=numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}


class Coffee
{
    protected void order()
    {
        System.out.println("Coffee");
    }
}

class Cappuccino extends Coffee
{
    public static void main(String args[])
    {
        Cappuccino c = new Cappuccino();
        c.order();
    }
}



