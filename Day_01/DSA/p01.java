package Day_01.DSA;

import java.util.Scanner;

class bubble{
    // function for sorting array using bubble sort
    void bubbleSort(int[] arr, int n){
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                }
            }
        }
        // displaying sorted array
        System.out.print("Array after sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    } 
}

public class p01 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] str = new int[n];
        
        // taking array of integers as input from user.
        for(int i=0; i<n; i++){
            str[i] = sc.nextInt();
        }

        // displaying unsorted array
        System.out.println("Array before sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(str[i] + " ");
        }

        System.out.println();
        bubble b = new bubble();  // creating object of class bubble
        b.bubbleSort(str, n);
        sc.close();
    }
}