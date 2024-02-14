// insertion sort

package missionplacemets.day_2.DSA;
class Methods{
    public void insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class que1 {
    public static void main(String[] args) {
        Methods m1=new Methods();
        int arr[]=new int[]{12,34,8,11,4};
        System.out.print("Before Sorting: ");
        m1.printArray(arr);
        m1.insertionSort(arr);
        System.out.print("\nAfter Sorting: ");
        m1.printArray(arr);
    }
}
