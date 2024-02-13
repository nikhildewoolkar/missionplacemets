//                             Insertion sort
// Time complexity:
// Best case: O(n)    // when array is already sorted then the inner while loop  will not run.
// Average case: O(n^2)
// Worst case: O(n^2)                            

package Day_02.DSA;

import java.util.Scanner;

class insertion{
    public int i, j;
    void insertionSort(int[] arr, int n){
        for(int i=0; i<=n-1; i++){
            j = i;
            while(j>0 && arr[j-1]>arr[j]){          // checking for the elements in the left that they are greater or smaller.

                // swapping the elements one by one to place the element at index i to its correct position.
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }
}

public class p01 {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        insertion in = new insertion();
        in.insertionSort(arr, n);
        System.out.println("Array after sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}