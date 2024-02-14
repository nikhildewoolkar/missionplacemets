package DSA_Problems;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,2,7,9,1,4,6,5};
        InsertionSort array = new InsertionSort();
        array.sort (arr);
        array.printArray(arr);
    }

    public void sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int Key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > Key ){
                arr[j+1] = arr[j];
                j = j-i;
            }
            arr [j+1] = key;
        }
    }

    public void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n ; ++i){
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }
}
