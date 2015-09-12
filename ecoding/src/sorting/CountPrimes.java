package sorting;

import java.util.Arrays;

public class CountPrimes {
	public int countPrimes(int n) {
		if(n<3){
			return 0;
		}
		if(n==3){
			return 1;
		}
		boolean[] f = new boolean[n];
		Arrays.fill(f, false);
		int t = (int) Math.sqrt(n);
		int count = 1;
		for(int i=3;i<n;i=i+2){
			if(f[i]==false){
				count++;
				if(i<=t){
					for(int j=i;j<n;j=j+i){
						f[j] = true;
					}
				}
			}
		}
	   return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
