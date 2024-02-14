package DSA_Problems;

public class TernarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(ternarySearch(arr, 10));
    }
    static int ternarySearch(int[] arr, int target){
        return ternarySearch(arr, target, 0, arr.length-1);
    }
    static int ternarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid1 = start + (end - start)/3;
        int mid2 = end - (end - start)/3;

        if(arr[mid1] == target){
            return mid1;
        }
        if(arr[mid2] == target){
            return mid2;
        }
        if(target < arr[mid1]){
            return ternarySearch(arr, target, start, mid1-1);
        }
        else if(target > arr[mid2]){
            return ternarySearch(arr, target, mid2+1, end);
        }
        else{
            return ternarySearch(arr, target, mid1+1, mid2-1);
        }
    }
}
