package sorting;

import java.util.Arrays;

class BubbleSort{
    public static void main(String[] args) {
        int[] arr={2,3,5,1,523,64};
        int size = arr.length;
        for (int i = 0; i < size - 1; i++){
        for (int j = 0; j < size - i - 1; j++){

            if (arr[j] > arr[j + 1]) {  
   
              int temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
    }
}