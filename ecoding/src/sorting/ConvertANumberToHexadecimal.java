/**
 * 
 */
package sorting;

/**
 * @author wyn
 * 405
 *
 */
public class ConvertANumberToHexadecimal {
	public static String toHex(int num) {
        if(num==0){
        	return "0";
        }
        int t = 15;
        StringBuffer sb = new StringBuffer();
    	while(num!=0){
    		int n = num&t;
    		if(n<10){
    			sb.insert(0, n);
    		}else{
    			sb.insert(0, String.valueOf((char)('a'+n-10)));
    		}
    		num = num>>>4;
    	}
		return sb.toString();
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1;
		System.out.println(toHex(a));
	}

}
