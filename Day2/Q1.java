public class Q1 {

    static void Isort(int arr[]){
    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        //finding out the correct position to insert
        while(prev >= 0 && arr[prev] > curr){
            arr[prev +1] =arr[prev];
            prev--;
        }
        //insertion
        arr[prev+1]=curr;
    }
    }
    
    static void printarr(Integer arr[]){
    for(Integer i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
    public static void main(String[] args) {
        Integer arr[]={5,4,2,3,1};
        Isort(arr);
        printarr(arr);

    }
}



