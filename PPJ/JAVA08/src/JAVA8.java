import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public
    class JAVA8 {

        public static void main(String[] arg) {
//            task1();
//            task2();
//            task3();
//            task4();
//            show(1);
//            modifyValue(5);
//            findMax(111,2311,311);
        }

        static void task1() {
            Scanner scan = new Scanner(System.in);
            Random r = new Random();
            int randNum = r.nextInt(10)+1;
            int[] tab = new int[randNum];
            System.out.print("[");
            for (int i = 0; i < randNum; i++) {
                tab[i] = r.nextInt(10);
                System.out.print(" "+tab[i]);
            }
            System.out.print(" ]\n");

            int secondRandNum = r.nextInt(10)+1;
            int[] secondTab = new int[secondRandNum];
            System.out.print("[");
            for (int i = 0; i < secondRandNum; i++) {
                secondTab[i] = r.nextInt(10);
                System.out.print(" "+secondTab[i]);
            }
            System.out.print(" ]\n");

            int thirdRandNum = r.nextInt(10)+1;
            int[] thirdTab = new int[thirdRandNum];
            System.out.print("[");
            for (int i = 0; i < thirdRandNum; i++) {
                thirdTab[i] = r.nextInt(10);
                System.out.print(" "+thirdTab[i]);
            }
            System.out.print(" ]\n");

            int[][] allTabs = {tab, secondTab, thirdTab};
            System.out.println(Arrays.deepToString(allTabs));
        }

    static void task2() {

    }

    static void task3() {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };
        ArrayList<Integer> tab1Dim = new ArrayList<Integer>();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab1Dim.add(tab[i][j]);
            }

        }
        System.out.println(tab1Dim);
    }

    static void task4() {
        int[][] tab = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int row = 0;
        int col = 0;
        int endRow = tab.length - 1;
        int endCol = tab[0].length - 1;
        while (row <= endRow && col <= endCol) {
            for (int i = col; i <= endCol; i++) {
                System.out.print(tab[row][i] + " ");
            }
            row++;
            for (int i = row; i <= endRow; i++) {
                System.out.print(tab[i][endCol] + " ");
            }
            endCol--;
            if (row <= endRow) {
                for (int i = endCol; i >= col; i--) {
                    System.out.print(tab[endRow][i] + " ");
                }
                endRow--;
            }
            if (col <= endCol) {
                for (int i = endRow; i >= row; i--) {
                    System.out.print(tab[i][col] + " ");
                }
                col++;
            }
        }
    }

    //TASK 5
    static void show(int voidNumber) {
        System.out.println(voidNumber);
    }


    //TASK 6
    static void modifyValue(int value) {
        int wrt = 5;
        System.out.println(value);
        value = value * wrt;
        System.out.println(value);


    }

    //TASK 7
    static void findMax(int value1, int value2, int value3) {
        if (value1 > value2 && value1 > value3) {
            System.out.println(value1);

        }
        if (value2 > value3) {
            System.out.println(value2);
        }
        else {
            System.out.println(value3);
        }

    }


}
