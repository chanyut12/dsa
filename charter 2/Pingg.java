// import java.util.ArrayList;
import java.util.Arrays;

public class Pingg {
    // public static void main(String[] args) {
    // ArrayList<String> cars = new ArrayList<>();
    // cars.add("mazda");
    // cars.add("volvo");
    // cars.add("lambo");
    // cars.add("honda");
    // cars.add("toyota");
    // cars.add("bmw");
    // System.out.println(cars);
    // }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArr =  new int[arr.length + 1];
        int pos =  2;
        int value = 99;
        for (int i = 0 ; i < pos; i++)
            newArr[i] = arr[i];
        newArr[pos] = value;
        for(int i=0;i<arr.length ; i++)
            newArr[i+1] = arr[i];
        
        System.out.println(Arrays.toString(newArr));
    }
}