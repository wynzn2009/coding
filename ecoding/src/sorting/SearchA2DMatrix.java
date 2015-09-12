package sorting;

public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null){
			return false;
		}
        int i = matrix.length-1;
        int j = 0;
        while(j<matrix[0].length&&i>=0){
        	if(matrix[i][j]==target){
        		return true;
        	}else if(matrix[i][j]>target){
        		i--;
        	}else{
        		j++;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
