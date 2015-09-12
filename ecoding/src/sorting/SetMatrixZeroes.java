package sorting;

import java.util.Arrays;

public class SetMatrixZeroes {
	public static void setZeroes(int[][] matrix) {
		boolean r = false;
		boolean c = false;
        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix[i].length;j++){
        		if(matrix[i][j]==0){
        			if(i!=0&&j!=0){
        				matrix[i][0] = 0;
        				matrix[0][j] = 0;
        			}else{
        				if(i==0){
        					r = true;
        				}
        				if(j==0){
        					c = true;
        				}
        			}
        		}
        	}
        }
        for(int i=1;i<matrix.length;i++){
        	if(matrix[i][0]==0){
        		Arrays.fill(matrix[i], 0);
        	}
        }
        for(int j=1;j<matrix[0].length;j++){
        	if(matrix[0][j]==0){
        		for(int t=1;t<matrix.length;t++){
        			matrix[t][j] = 0;
        		}
        	}
        }
        if(r){
        	Arrays.fill(matrix[0], 0);
        }
        if(c){
        	for(int t=0;t<matrix.length;t++){
    			matrix[t][0] = 0;
    		}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{0},{1}};
		SetMatrixZeroes.setZeroes(matrix);
	}

}
