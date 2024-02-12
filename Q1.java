
public class Q1 {
    static void bubblesorting(int arr[]){
        for(int turn = 0; turn < arr.length-1;turn++){
            for(int j=0;j<arr.length-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        }
    
        public static void printArr(int arr[]) {
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int arr[]={1,3,5,4,6};
            bubblesorting(arr);
            printArr(arr);
        }
}
