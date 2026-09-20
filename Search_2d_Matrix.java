class Search_2d_Matrix{
    public boolean searchMatrix(int[][] matrix, int target) {
        int k=0;
        int m=matrix.length;
        int n=matrix[0].length;
        while(k<m){
            if(matrix[k][n-1]>target){
                int left=0,right=n-1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if(matrix[k][mid] == target){
                    return true;
                    }
                    else if (matrix[k][mid] < target){
                    left = mid + 1;
                    }
                    else{
                    right = mid - 1;
                    }
                    }
                    return false;

            }else{
                k++;
            }
        }
        return false;
    }
}