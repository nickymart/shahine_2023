package homeworks;

public class ForExamples {
    public static void main(String[] args) {
        printNumbers(1000);
        evenNumbers(100);
        System.out.println();
        System.out.println(arrayMaxElem(new int[]{2,5,8,4,9,3,7}));
    }

    public static void printNumbers(int n) {
        for (int i = 1; i < n; i++)
            System.out.print(i + " - ");
        System.out.println(n);
    }

    public static void evenNumbers(int n) {
        for (int i = 1; i <= n; i++)
            if ((i % 10) % 2 == 0)
                System.out.print(i + " ");
    }

    public static int arrayMaxElem(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
