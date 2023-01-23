import java.util.Scanner;

public class Package4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello world!");
        //I.

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.println("Pole prostokatu wynosi " + (a * b));
        System.out.println("Obwod prostokatu wynosi " + (2 * a + 2 * b));
        if (!(a % 1 == 0 && b % 1 == 0)) {
            System.out.println("Podane dane sa nieprawidlowe.");
        }
        //II.
        int numbersLimit = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < numbersLimit; i++) {
            sum += scan.nextInt();
        }
        System.out.println(sum);

        //III.
        int i, large;
        int p = scan.nextInt();
        int[] arr = new int[p];
        System.out.print("Enter " + p + " Numbers: ");
        for (i = 0; i < p; i++)
            arr[i] = scan.nextInt();

        large = arr[0];
        for (i = 1; i < p; i++) {
            if (large < arr[i])
                large = arr[i];
        }
        System.out.println("\nLargest Number = " + large);

        //drugi sposób:
        System.out.println("Wprowadź ilość liczb");
        int amountOfNumbers = scan.nextInt();
        int max = Integer.MIN_VALUE;
        for (int u = 0; u < amountOfNumbers; u++) {
            int number = scan.nextInt();
            if (number > max) {
                max = number;

            }

        }
        System.out.println(max);

        //IV.
        int x = scan.nextInt();
        int y = scan.nextInt();
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;

        }
        System.out.println("NWD to: " + x);


        //V.
        System.out.print("Wprowadź liczbę: ");
        int number = scan.nextInt();

        if (number < 2) {
            System.out.println(number + " nie jest liczbą pierwszą");
        } else {
            boolean isPrime = true;
            for (int o = 2; o <= Math.sqrt(number); o++) {
                if (number % o == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " jest liczbą pierwszą");
            } else {
                System.out.println(number + " nie jest liczbą pierwszą");
            }
        }


    }


}
