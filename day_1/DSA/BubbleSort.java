import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int arr[],int n){
        int temp;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false)
                break;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values in array:");
        for(int i=0 ;i<5; i++) 
            arr[i]=sc.nextInt();
        bubbleSort(arr,n);
        System.out.print("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        sc.close();
    }
}
