package homeworks;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,7,6,5,4,3,2,1};

        sort(arr);
        printArray(arr);
    }
    public static void printArray(int[] arr){

        for (int j : arr)
            System.out.print(j + " ");

        System.out.println();
    }
    public static void sort(int[] arr){
        int elem;

        for(int i = 0; i < arr.length;i++){

            for(int j = 0;j < i; j ++){

                if(arr[j] > arr[i]){
                    elem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = elem;
                }
            }
        }
    }
}
