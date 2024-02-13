package Day01.DSA;

import java.util.Scanner;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j= matrix[0].length - 1;
        while(i<matrix.length && j > -1){
            int temp=matrix[i][j];
            if(temp==target){
                return true;
            }
            else if(temp>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}

public class Q5matrix {
    public static void main(String[] args) {
        Solution s=new Solution();
        int search;
        Scanner sc=new Scanner(System.in);
    
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        System.out.println("Enter the number to search");
        search=sc.nextInt();
        System.out.println("The "+search+" present in matrix: "+ s.searchMatrix(matrix, search));
        sc.close();
    }
}
