class searchInMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {    
      int rowIndex = searchRow(matrix,target);  
      if(rowIndex!=-1)
          return binarySearch(rowIndex,matrix,target);
      else return false;
    }
    public int searchRow(int[][] matrix, int target)
    {
        int low=0;
        int high=matrix.length-1;
        while(low<=high){
            int mid=(high + low)/2;
            if(matrix[mid][0]<=target && target<=matrix[mid][matrix[0].length-1])  return mid;
            else if(matrix[mid][0]<target) low=mid+1;
            else if(matrix[mid][0]>target) high=mid-1;
        }
        return -1;
    }
    public boolean binarySearch(int rowIndex,int[][] matrix, int target)
    {
        int low=0;
        int high= matrix[rowIndex].length - 1;
        while(low<=high)
        {
            int mid= (high + low)/2;
            if(matrix[rowIndex][mid]==target) return true;
            else if(matrix[rowIndex][mid]<target) low=mid+1;
            else if(matrix[rowIndex][mid]>target) high=mid-1;
        }
        return false;
    }
}
public class Search_2D_Matrix {
    public static void main(String[] args) {
        searchInMatrix s1 =new searchInMatrix();
        int arr[][]=new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8},{9,10,11,12}};
        int target=7;
        System.out.println(s1.searchMatrix(arr, target));
    }
}
