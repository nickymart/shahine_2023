package dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args){
        DynamicArray example = new DynamicArray(1);
        example.add(10);

        System.out.println(example.getByIndex(3));
        example.deleteByIndex(0);
        example.add(20);
        example.add(32);
        example.add(1, 12);
        example.set(1, 25);
        System.out.println(example.getIndexByValue(32));
        example.print();
    }
}
