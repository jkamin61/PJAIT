import java.util.Random;

public class Main {


    public static void main(String[] args) {

        int[] result = splitToDigits(5);
        int nextResult = charCount('a');
        char[] palindromTab = {'t','e','s','t'};
        int againNextResult = isPalindrom(palindromTab);
        System.out.println(isArmstrongNumber(1634));
        int[] tab = {1,2,3,4,5,6,7,8,9,0};
        swap(tab,3,6);
        for (int i = 0; i< tab.length;i++) {
            System.out.println(tab[i]);
        }
    }

    //ZAD 2
    static int charCount(char myChar) {
        char[] sentence = {'a', 'l', 'a', 'm', 'a', 'k','o','t','a'};
        int total = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == myChar) {
                total += 1;
            }
        }
        System.out.println("\n"+total);
       return total;
    }

    //ZAD 3
     boolean isEqual(int[][] arr, int[][] tab) {
        if (arr != tab) {
            System.out.println("Our arrays do not match.");
        }
         return true;

    }

    //ZAD 4

    static int[] splitToDigits(int plusValue) {
        Random r = new Random();
        int[] arr = new int[plusValue];
        System.out.print("[");
        for (int i = 0; i < plusValue; i++) {
            arr[i] = plusValue;
            System.out.print(" "+arr[i]);
        }
        System.out.print(" ]");
        return arr;
    }

    //ZAD 5

    public static boolean isArmstrongNumber(int number) {

        int iloscCyfr = 0;
        int liczby;
        int sum = 0;
        int potega;
        boolean result;
        int number1=number;


        if (number == 0) {
            iloscCyfr = 1;
            liczby = 0;
        }

        for (int i = number; i > 0; i /= 10) {
            iloscCyfr++;
            //System.out.println("ilosc cyfry "+iloscCyfr);
        }

        int[] tab = new int[iloscCyfr];

        for (int i = 0; number > 0; i++) {
            liczby = number % 10;
            //System.out.println("liczby: "+liczby);
            number /= 10;
            tab[i] = liczby;
            potega = liczby;

            for(int j = 0;j < iloscCyfr-1;j++) {
                potega *= liczby;
                //System.out.println("Liczba " + liczby + " " + potega);
            }
            sum += potega;
            //System.out.println("Suma " + sum);
        }

        if (sum == number1) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    //ZAD 6

//    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
//
//    }

//    int integerLength(int value, int dl) {
//        return (value > 9) ? integerLength(value / 10, dl + 1) : dl;
//    }



    //ZAD 7

    public static int[] swap(int[] tab, int source, int destination){

        int number1 = tab[source];
        int number2 = tab[destination];

        tab[destination] = number1;
        tab[source] = number2;

        return tab;

    }

    // ZAD 8
    static int isPalindrom(char[] deliveredChar) {
        int lastIndex = deliveredChar.length - 1;
        int palindromResultCheck = 0;
        for (int i = 0; i < deliveredChar.length; i++) {
            if (deliveredChar[i] != deliveredChar[lastIndex]) {
                palindromResultCheck = 1;
            } else {
                palindromResultCheck = 0;
            }
        }
        if (palindromResultCheck == 1) {
            System.out.println("Is Palindrom");
        } else {
            System.out.println("Is not Palindrom");
        }
        return palindromResultCheck;
    }

}
