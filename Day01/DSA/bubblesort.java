package Day01.DSA;

import java.util.Scanner;

public class bubblesort {
    public static void bubbleSort(int[] arr, int n) {   
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
              if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }  
            }
        }
    }
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr,n);
        for(int num: arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
