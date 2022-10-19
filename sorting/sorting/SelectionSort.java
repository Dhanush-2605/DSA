package sorting;

public class SelectionSort{

        public static void swap(int a[], int i, int j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;        }
   
        public static void selectionSort(int a[], int n){
          
            for( int i = 0; i < n - 1; i++ ){    
                int minIndex = i;             
                for( int j = i + 1; j < n; j++){    
        
                    if ( a[j] < a[minIndex] )
                        minIndex = j;
                }
    
                swap(a, i, minIndex);
            } 
        }
        public static void main(String args[]){

            int a[]={3,54,2,6,4,23,43};
    

            for( int i = 0; i < a.length; i++ )
                System.out.print(a[i] + " ");
            System.out.println();
    
        
            selectionSort(a, a.length);
    
  
            for( int i = 0; i < a.length; i++ )
                System.out.print(a[i] + " ");
            System.out.println();
        }
    
    
    
}
