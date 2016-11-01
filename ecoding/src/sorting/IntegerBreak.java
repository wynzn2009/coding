/**
 * 
 */
package sorting;

/**
 * @author wyn
 * 343
 *
 */
public class IntegerBreak {
	public static int integerBreak(int n) {
		if(n==2){
			return 1;
		}
		if(n==3){
			return 2;
		}
        int sum = 1;
        int sum1 = 1;
        int t = n/2;
        int tt = n%2;
        int s = n/3;
        int ss = n%3;
        sum = sum*(int)Math.pow(2, t-tt)*(int)Math.pow(3, tt);
        if(ss==2){
        	sum1 = sum1*(int)Math.pow(3, s)*2;
        }else if(ss==1){
        	sum1 = sum1*(int)Math.pow(3, s-1)*2*2;
        }else{
        	sum1 = sum1*(int)Math.pow(3, s);
        }
        return Math.max(sum, sum1);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(integerBreak(8));
	}

}
