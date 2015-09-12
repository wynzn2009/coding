package sorting;

public class NumberOfDigitOne {
	public int countDigitOne(int n) {
		if(n<=0){
			return 0;
		}
		int sum = 0;
		int temp = n;
		int all = 1;
		while(temp>0){
			int t = temp%10;
			int b = n/(10*all);
			int c = n%all;
			if(t>1){
				t = 1;
				sum += (b+t)*all;
			}else if(t==1){
				if(temp/10>0){
					sum += b*all + c +1;
				}else{
					sum += c +1;
				}
			}else{
				sum += b*all;
			}
			all *= 10;
			temp /= 10;
		}
		return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfDigitOne n = new NumberOfDigitOne();
		System.out.println(n.countDigitOne(1410065408));
	}

}
