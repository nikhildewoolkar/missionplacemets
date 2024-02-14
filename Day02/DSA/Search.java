import java.util.*;

class Sort {
  public void insertSort(int[] arr){
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }
}

class BinarySearch {
  public int search(int[] arr, int target){
    int low = 0;
    int high = arr.length - 1;
    int mid = 0;
    while(low<=high){
      mid = (low + high) / 2;
      if(arr[mid] == target){
        return mid;
      } else if (arr[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }
}

class LinearSearch {
  public int search(int[] arr, int target){
    for(int i = 0;i<arr.length;i++){
      if(arr[i] == target){
        return i;
      }
    }
    return - 1;
  }
}

class Search {
  public static void main(String args[]){
    BinarySearch bs = new BinarySearch();
    LinearSearch ls = new LinearSearch();
    Sort sort = new Sort();
    int[] arr = new int[]{9,5,4,3,7,1,2,6,8,0};
    // pre-requ arr need to be sorted
    sort.insertSort(arr);
    
    System.out.println("Printing index of 8 using BinerySearch " + bs.search(arr, 8));
    System.out.println("Printing index of 23 using BinerySearch " + bs.search(arr, 23));

    
    System.out.println("Printing index of 8 using BinerySearch " + ls.search(arr, 8));
    System.out.println("Printing index of 23 using BinerySearch " + ls.search(arr, 23));
  }
}