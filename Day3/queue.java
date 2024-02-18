package Day3;

class Methods{
    public void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                   min = j; 
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;    
        }
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class queue {
    public static void main(String[] args) {
        Methods m1=new Methods();
        int arr[]=new int[]{12,34,8,11,4};
        System.out.print("Before Sorting: ");
        m1.printArray(arr);
        m1.selectionSort(arr);
        System.out.print("\nAfter Sorting: ");
        m1.printArray(arr);
    }
}
