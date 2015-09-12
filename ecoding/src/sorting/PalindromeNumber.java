package sorting;

public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
        if(x<0){
        	return false;
        }
		int t = (int)Math.log10(x);
		int ten = (int)Math.pow(10, t);
		t = (t+1)/2;
		while(t>0){
			if(x%10!=x/ten){
				return false;
			}
			x = x - ten*(x/ten);
			x = x/10;
			ten /= 100;
			t--;
		}
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber.isPalindrome(9999);
	}

}
