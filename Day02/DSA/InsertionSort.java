import java.lang.*;

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

class InsertionSort {
  public static void main(String args[]){
    Sort sort = new Sort();
    int[] arr = new int[]{9,5,4,3,7,1,2,6,8,0};
    sort.insertSort(arr);
    for(int i: arr){
      System.out.println(i);
    }
  }
}