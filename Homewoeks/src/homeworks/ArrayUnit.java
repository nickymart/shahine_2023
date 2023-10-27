package homeworks;

public class ArrayUnit {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.print("Array:");
        printArray(arr);
        System.out.print("FirstElrm:");
        arrayFirstElem(arr);
        System.out.print("LastElem:");
        arrayLastElem(arr);
        System.out.print("Length:");
        arrayLength(arr);
        System.out.println("MinElem:" + arrayMinElem(arr));
        arrayMiddleElem(arr);
        System.out.println("EvenElementsCount:" + arrayEvenCount(arr));
        System.out.println("OddElementsCount:" + arrayOddCount(arr));
        System.out.println("Sum Of Array elements is " + sumOfArrayElem(arr));
        System.out.println("Arithmetic mean of array elements is " + arithmeticMean(arr));
    }
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void arrayFirstElem(int[] arr){
        System.out.println(arr[0]);
    }
    public static void arrayLastElem(int[] arr){
        System.out.println(arr[arr.length - 1]);
    }
    public static void arrayLength(int[] arr){
        System.out.println(arr.length);
    }
    public static int arrayMinElem(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void arrayMiddleElem(int[] arr){
        if(arr.length <= 2)
            System.out.println("Can't print middle values!");
        if(arr.length % 2 == 0)
            System.out.println("Array midddle elements is " + arr[(arr.length - 1) / 2] + " and " + arr[(arr.length) / 2]);
        else
            System.out.println("Array middle element is " + arr[(arr.length - 1) / 2]);
    }
    public static int arrayEvenCount(int[] arr){
        int even = 0;
        for(int i: arr)
            if(i % 2 == 0)
                even++;
        return even;
    }
    public static int arrayOddCount(int[] arr){
        int odd = 0;
        for(int i: arr)
            if(i % 2 != 0)
                odd++;
        return odd;
    }
    public static int sumOfArrayElem(int[] arr){
        int sum = 0;
        for(int i: arr)
            sum += i;
        return sum;
    }
    public static double arithmeticMean(int[] arr){
        return (double) sumOfArrayElem(arr) / arr.length;
    }
}