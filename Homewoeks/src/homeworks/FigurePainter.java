package homeworks;

import java.util.Scanner;

public class FigurePainter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Size:");
        int size = sc.nextInt();

        rightangle(size);

        System.out.println();

        figure_1(size);

        System.out.println();

        figure_2(size);

        System.out.println();

        figure_3(size);

        System.out.println();

        figure_4(size);

        System.out.println();

        figure_5(size);

    }

    public static void rightangle(int size) {

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void figure_1(int size) {

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (j <= i) System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void figure_2(int size) {

        for (int i = 0; i < size; i++) {

            for (int j = size - 1; j >= 0; j--) {
                if (j >= i) System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void figure_3(int size) {

        for (int i = size - 1; i >= 0; i--) {

            for (int j = 0; j < size; j++) {
                if (j >= i) System.out.print("* ");
                else System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void figure_4(int size) {

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (j >= i) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void figure_5(int size) {

        for (int i = 1; i <= size; i++) {

            for (int j = size; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {

            for (int j = size; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}