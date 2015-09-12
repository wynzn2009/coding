package lo.java.container;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BTest {
	public static double solve(long num,int pow){
		return Math.pow(num, 1.0/pow);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("E:/B-small-attempt1.in");
		File file1 = new File("E:/output.in");
		BufferedReader reader = null;
		FileWriter writer = new FileWriter("E:/output.in");
        BufferedWriter bw = new BufferedWriter(writer);
		reader = new BufferedReader(new FileReader(file));
		int count = Integer.valueOf(reader.readLine());
		int i = 1;
		java.text.DecimalFormat df=new java.text.DecimalFormat("#.#########"); 
		while (count>0) {  
            // œ‘ æ––∫≈  
			String a = reader.readLine();
			int n = Integer.valueOf(a.split(" ")[0]);
			int q = Integer.valueOf(a.split(" ")[1]);
			String[] num = reader.readLine().split(" ");
			bw.write("Case #"+i+":");
			bw.write("\r");
			for(int j=0;j<q;j++){
				String[] ft = reader.readLine().split(" ");
				int c = Integer.valueOf(ft[1])-Integer.valueOf(ft[0])+1;
				int start = Integer.valueOf(ft[0]);
				double sum = 1.0;
				
				for(int u = start;u<c+start;u++){
					Long l = Long.valueOf(num[u]);
					sum *= solve(l,c);
				}
				String result = df.format(sum);
				bw.write(result);
				bw.write("\r");
			}
			i++;
			count--;
        }
		bw.close();
        writer.close();
        reader.close();

	}

}
