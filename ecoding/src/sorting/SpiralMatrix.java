package sorting;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<Integer>();
		if(matrix==null||matrix.length==0){
			return l;
		}
		int t = 0;
		int e = matrix.length;
		int u = matrix[0].length;
		int total = e* u;
		int count = 0;
		int i = 0;
		int j = 0;
		while(count<total){
			if(matrix[i][j]==Integer.MIN_VALUE){
			    switch(t){
    				case 0:
    				    j--;
    					break;
    				case 1:
    				    i--;
    					break;
    				case 2:
    				    j++;
    					break;
    				case 3:
    				    i++;
    					break;
    			}
				t++;
				t = t%4;
			}else{
				l.add(matrix[i][j]);
				matrix[i][j] = Integer.MIN_VALUE;
				count++;
			}
			switch(t){
				case 0:
					if(j==u-1){
						t = 1;
						i++;
					}else{
						j++;
					}
					break;
				case 1:
					if(i==e-1){
						t = 2;
						j--;
					}else{
						i++;
					}
					break;
				case 2:
					if(j==0){
						t = 3;
						i--;
					}else{
						j--;
					}
					break;
				case 3:
					i--;
					break;
			}
		}
		return l;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1},{5},{9}};
		SpiralMatrix.spiralOrder(matrix);
	}

}
