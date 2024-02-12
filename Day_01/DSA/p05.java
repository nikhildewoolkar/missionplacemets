package Day_01.DSA;

import java.util.Scanner;

class search {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while(i<matrix.length && j > -1){
            int temp = matrix[i][j];
            if (target == temp){
                return true;
            } else if (temp > target){
                j--;
            } else{
                i++;
            }
        }   
        return false;
    }
}

class p05{
    public static void main(String[] args) {
        int[][] matrix = {{5, 6, 7, 9}, {11, 13, 19, 21}, {24, 29, 33, 35}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to be searched: ");
        int target = sc.nextInt();

        search s = new search();
        System.out.println("Is " + target + " present in the given matrix: " + s.searchMatrix(matrix, target));
        sc.close();
    }
}
