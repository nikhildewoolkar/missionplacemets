import java.util.*;

class Sort {
  public void sort(int[] arr){
    int n = arr.length;
    int temp = 0;
    for(int i=0; i < n  - 1; i++){
      for(int j=1; j < n - i; j++){
        if(arr[j] < arr[j-1]){
          temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  } 
}

public class BubbleSort {
  public static void main(String args[]){
    int[] x = new int[]{5,3,6,7,1,2,4};
    Sort obj = new Sort();
    obj.sort(x);
    for(int i: x){
      System.out.println(i);
    }
  }
}