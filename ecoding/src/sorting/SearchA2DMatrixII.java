package sorting;

public class SearchA2DMatrixII {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null){
			return false;
		}
        int i = 0;
        int j = matrix[0].length-1;
        while(j>=0&&i<matrix.length){
        	if(matrix[i][j]==target){
        		return true;
        	}else if(matrix[i][j]>target){
        		j--;
        	}else{
        		i++;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
