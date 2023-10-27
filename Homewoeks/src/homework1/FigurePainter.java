package homework1;

import java.util.Scanner;

public class FigurePainter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Size:");
        int size = sc.nextInt();

        rightangle(size);

        System.out.println();

        triangle_1(size);

        System.out.println();

        triangle_2(size);

        System.out.println();

        triangle_3(size);

        System.out.println();

        triangle_4(size);

    }

    public static void rightangle(int size){
        for(int i = 0; i < size;i++){
            for(int j = 0; j < size; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle_1(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(j <= i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle_2(int size){
        for(int i = 0; i < size; i++){
            for(int j = size - 1; j >= 0; j--){
                if(j >= i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle_3(int size){
        for(int i = size - 1; i >= 0; i--){
            for(int j = 0; j < size; j++){
                if(j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void triangle_4(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
