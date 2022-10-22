package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]){
        int[] array={2,4,7,1,8,9};
        int size = array.length;

        for (int step = 1; step < size; step++) {
          int key = array[step];
          int j = step - 1;
    
          while (j >= 0 && key < array[j]) {
            array[j + 1] = array[j];
            --j;
          }
    
          array[j + 1] = key;
        
    }
    System.out.println(Arrays.toString(array));
}
}