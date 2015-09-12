package sorting;

public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
        if(n<=0){
        	return false;
        }
        int count = 0;
        for(int i=0;i<32;i++){
        	if((n&(1<<i))>0){
        		count++;
        		if(count>1){
        			return false;
        		}
        	}
        }
        return true;
    }
	public boolean isPowerOfTwo1(int n) {
        return n>0&&((n&(n-1))==0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
