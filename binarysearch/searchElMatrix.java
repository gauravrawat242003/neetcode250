package binarysearch;

public class searchElMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int l = 0 , h = rows * cols - 1;

        while(l <= h){
            int mid = (l + h) / 2;
            int midElement = matrix[mid / cols][mid % cols];

            if(midElement == target){
                return true;
            }else if(midElement < target){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return false;    
    }

    public static void main(String[] args) {
        searchElMatrix sol = new searchElMatrix();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        boolean ans = sol.searchMatrix(matrix, target);

        System.out.println(ans);
    }
}

// 2nd Approach
 
class Solution {
    public  boolean bs(int []matrix , int target){
        int n = matrix.length;
        int l = 0 , h = n-1;

        while(l <= h){
            int mid = (l + h)/2;

            if(matrix[mid] == target){
                return true;
            }else if(matrix[mid] > target){
                h = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i =0 ; i<row ;i++) {
            if(matrix[i][0] <= target && target <= matrix[i][col-1]){
                return bs(matrix[i], target);
            }
        }
        return false;
    }
}
