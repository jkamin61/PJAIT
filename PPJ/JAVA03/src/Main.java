

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    //1.
        //ZAD I.
        int x = 5;
        System.out.println((x = 4) * x);
        //zmienna została nadpisana w powyższym kodzie, dlatego też pierwotna wartość zmiennej uległa unieważnieniu.

        //ZAD II.
        String myNumbers = "(((1+2*3+4)/(5-6))+78)/(9-(10/11))";
        double mySol = (((1 + 2 * 3 + 4) / (5 - 6)) + 78) / (9 - (10 / 11));
        System.out.println(myNumbers + " = " + mySol);

        //ZAD III.

        char a = Character.MAX_VALUE;
        char a1 = Character.MIN_VALUE;
        System.out.println("(CHAR) MAX: "+a+" MIN: "+ a1);

        byte c = Byte.MAX_VALUE;
        byte c1 = Byte.MIN_VALUE;
        System.out.println("(BYTE) MAX: "+c+" MIN: "+ c1);

        short d = Short.MAX_VALUE;
        short d1 = Short.MIN_VALUE;
        System.out.println("(SHORT) MAX: "+d+" MIN: "+ d1);

        int e = Integer.MAX_VALUE;
        int e1 = Integer.MIN_VALUE;
        System.out.println("(INT) MAX: "+e+" MIN: "+ e1);

        long f = Long.MAX_VALUE;
        long f1 = Long.MIN_VALUE;
        System.out.println("(LONG) MAX: "+f+" MIN: "+ f1);

        float g = Float.MAX_VALUE;
        float g1 = Float.MIN_VALUE;
        System.out.println("(FLOAT) MAX: "+g+" MIN: "+ g1);

        double h = Double.MAX_VALUE;
        double h1 = Double.MIN_VALUE;
        System.out.println("(DOUBLE) MAX: "+h+" MIN: "+ h1);


        //ZAD IV.

        int myYear = 2022;
        boolean firstMod = myYear % 4 == 0;
        boolean secondMod = !(myYear % 100 == 0);
        boolean thirdMod = myYear % 400 == 0;
        if (firstMod && secondMod || thirdMod) {
            System.out.print(myYear + " is a leap year!");
        } else {
            System.out.print(myYear + " is not a leap year!");
        }

        //ZAD V.
        System.out.println(1234.567);
        System.out.println(12.34567E2);
        System.out.println(1.234567E06);
        System.out.println(1234567E-3);
        // ^powyższa liczba równa się szukanej liczbie 1234.567

        //ZAD VI.
        long aLong = 0b1010000101000101101000010100010110100001010001011010000101000101L;
        System.out.println(aLong);

    //2.
        //ZAD I.
        int myLitOne = 168;
        double myLitTwo = 16.3;
        double myLitThree = .2;
        float myLitFour = 15.87f;
        double myLitFive = 3d;
        long myLitSix = 3l;
        long myLitSeven = 3_500_000_000l;
        boolean myLitEight = false;
        String myLitNine = "Hello";
        char myLitTen = 'A';
        byte myLitEleven = 0b10101;

        //ZAD II.
//        char testI = d+ 1;
// Rezultat operacji I - Error.
        int testII = 1 + d;
        System.out.println(testII);
// Rezultat operacji II - otrzymaliśmy liczbę z sumy.
//        float testIII = 3.14d + 10.5;
// Rezultat operacji III - Error.
        byte testIV = 0b00100001 + 10;
        System.out.print(testIV);
// Rezultat operacji IV - otrzymaliśmy liczbę z sumy.

        //ZAD III.
        boolean czyPada = true;
        String myTernary = czyPada ? "Pada" : "Nie pada";
        System.out.println(myTernary);

        //ZAD IV.
        int wrt = 0;
        String ternaryExample = wrt >= 0 && wrt <= 1 ? "Nalezy do zbioru A, B, C" : wrt >= 0 ? "Nalezy do zbioru A" : wrt <= 1 ? "Nalezy do zbioru B" : wrt >= 0 && wrt <= 1 ? "Nalezy do zbioru C" : "Nie nalezy do zbiorow";
        System.out.println(ternaryExample);

        //ZAD V.
        byte n = 5;
        byte m = 10;
        int b = (byte) n + (byte) m;

        //ZAD VI.
        java.util.Scanner in = new java.util.Scanner (System.in);
        int studentId = in.nextInt ();
        System.out.println("Hello s"+studentId);

        //ZAD VII.
        int numToTransfer = in.nextInt();
        char myChar = (char) numToTransfer;
        System.out.println(myChar);
    }
}

