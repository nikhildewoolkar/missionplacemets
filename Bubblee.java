import java.util.Scanner;

public class Bubblee {




    public static void main(String[] args) {

       int arr[] = {13, 43,26,17,95};
       int n = arr.length;
       System.out.println("Before using bubble sort: ");
        for(int i=0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr, n);
    }

 
    static void bubble_sort(int arr[], int n){
        for(int i = n - 1; i>=0; i-- ){
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("after bubble sort: ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }
    
}


