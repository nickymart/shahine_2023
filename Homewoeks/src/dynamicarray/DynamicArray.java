package dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;


    public DynamicArray(int size) {
        array = new int[size];
    }
    public void add(int value) {
        if(size == array.length){
            extend();
        }
        array[size] = value;
        size++;
    }
    private void extend(){
        int temp[] = new int[array.length * 2];
        for (int i = 0; i < array.length; i++)
        {
            temp[i] = array[i];
        }
        array = temp;
    }
    public int getByIndex(int index) {
        if(index >= 0 && index < size){
            return array[index];
        }
        return -1;
    }
    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }
    }

    public void deleteByIndex(int index) {
        if(size == 0)
            return;
        if(index < 0 && index >= size){
            System.out.println("Element doesn't exist");
            return;
        }
        for (int i = index; i < size - 1; i++)
        {
            array[i] = array[i + 1];
        }
        array[size - 1] = 0;
        size--;
    }

    public void add(int index, int value) {
        if (size == array.length)
        {
            extend();
        }
        for (int i = size - 1; i >= index; i--)
        {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }
    public void set(int index, int value) {
        if(index<0 || index >= size){
            System.out.println("Element doesn't exist");
            return;
        }
        array[index] = value;
    }
    public int getIndexByValue(int value) {
        for(int i = 0; i < size; i++)
            if(array[i]  == value)
                return i;
        return 0;
    }
}

