import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        /*
        double arr[] = new double[10];
        System.out.print(" [ ");
        for (int i = 0; i < 10;i++) {
            arr[i] = rand.nextDouble() * 10;
            System.out.print(Math.round(arr[i])+", ");
        }
        System.out.print("] ");

        System.out.print("\n [ ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {

                System.out.print(Math.round(arr[i])+", ");

            }
        }
        System.out.print("] ");

        System.out.print("\n [ ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {

                System.out.print(Math.round(arr[i])+", ");

            }
        }
        System.out.print("] ");
        */

        /*
        char[] exChars = {'s', 'u', 'r'};
        char max = exChars[0];
        for (int i = 0; i < exChars.length; i++) {
            if (exChars[i] > max) {
                max = exChars[i];
            }
        }
        System.out.println(max);
        */

        System.out.print("\n [ ");
        char[] charArray = new char[5];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char)(rand.nextInt(26) + 'a');
            System.out.print(charArray[i]+" ");
        }
        System.out.print("]\n");
        char c= scan.next() .charAt(0) ;

        for (int i = 0; i < charArray.length;i++) {

            for (int j = 0; j < charArray.length; j++) {
                if (c == charArray[i]) {
                    charArray[i] = '0';

                }
                System.out.print(charArray[i] + " ");
            }
            System.out.print("]\n");
        }
    }
}