package sorting;

import java.util.ArrayList;

public class DecodeWays {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public int numDecodings(String s) {
		if("".equals(s)||s.charAt(0)=='0'){
			return 0;
		}
		list.add(1);
		list.add(2);
		int sum = 1;
		int temp = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='1'||s.charAt(i)=='2'){
				temp++;
			}else{
				if(temp!=0){
					int f = getF(temp);
					if(s.charAt(i)=='0'){
						f = getF(temp-1);
						sum *= f;
					    temp = 0;
					    continue;
					}
					if(s.charAt(i-1)=='1'){
						f = f + getF(temp-1);
					}else{
						if(s.charAt(i)<'7'){
							f = f + getF(temp-1);
						}
					}
					sum *= f;
					temp = 0;
				}else{
					if(s.charAt(i)=='0'){
						return 0;
					}
				}
			}
		}
		if(temp>0){
			sum *= getF(temp);
		}
		return sum;
    }
	private int getF(int k){
		if(k==0){
			return 1;
		}
		int length = list.size();
		if(length>=k){
			return list.get(k-1);
		}else{
			for(int i=length;i<=k;i++){
				int re = list.get(i-1)+list.get(i-2);
				list.add(re);
			}
			return list.get(k-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecodeWays d = new DecodeWays();
		d.numDecodings("10");
	}

}
