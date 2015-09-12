package lo.java.container;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {
	public static int solve(int kth){
		int[] a = {0,0,1};
		int k = kth;
		int count = 0;
		if(k<=2){
			return a[k];
		}
		while(k>2){
			int n = (int) (Math.log(k+1)/Math.log(2))+1;
			int temp = k;
			k = (1<<n)-2-k;
			if(temp == k){
				break;
			}
			count++;
		}
		int l = 0;
		if(k>2){
			l=0;
		}else{
			l = a[k];
			
		}
		if(count%2!=0){
			l = 1-l;
		}
		return l;
	}
	public static int solve(long kth){
		int[] a = {0,0,1};
		long k = kth;
		int count = 0;
		if(k<=2){
			return a[(int)k];
		}
		while(k>2){
			int n = (int) (Math.log(k+1)/Math.log(2))+1;
			long temp = k;
			k = (1l<<n)-2-k;
			if(temp == k){
				break;
			}
			count++;
		}
		int l = 0;
		if(k>2){
			l=0;
		}else{
			l = a[(int)k];
			
		}
		if(count%2!=0){
			l = 1-l;
		}
		return l;
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(solve(416293848072673556l));
		/*
		 *  */
		File file = new File("E:/A-large.in");
		File file1 = new File("E:/output.in");
		BufferedReader reader = null;
		FileWriter writer = new FileWriter("E:/output.in");
        BufferedWriter bw = new BufferedWriter(writer);
		reader = new BufferedReader(new FileReader(file));
		String tempString = null;
		int count = Integer.valueOf(reader.readLine());
		int i = 1;
		
		while ((tempString = reader.readLine()) != null) {  
            // œ‘ æ––∫≈  
			System.out.println(tempString);
			long kth = Long.valueOf(tempString);
			int re = solve(kth-1l);
			System.out.println(kth+"   "+re);
			bw.write("Case #"+i+": "+re);
			bw.write("\r");
			i++;
        }
		bw.close();
        writer.close();
        reader.close();
		
	}

}
