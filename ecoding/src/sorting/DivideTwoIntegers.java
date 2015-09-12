package sorting;

public class DivideTwoIntegers {
	public static int divide(int dividend, int divisor) {
        if(divisor==0){
        	return Integer.MAX_VALUE;
        }
        if(divisor==1){
        	return dividend;
        }
        int d = 0;
        if(dividend==Integer.MIN_VALUE){
        	dividend = dividend + Math.abs(divisor);
        	if(divisor==-1){
        		return Integer.MAX_VALUE;
        	}
        	d++;
        }
        if(divisor==Integer.MIN_VALUE){
        	return d;
        }
        boolean flag = true;
        boolean flag2 = true;
        if(dividend<0){
        	dividend = -dividend;
        	flag = false;
        }
        if(divisor<0){
        	divisor = -divisor;
        	flag2 = false;
        }
        int count = -1;
        int re = 0;
        while(dividend>=divisor){
        	while(dividend>=divisor){
        		count++;
        		divisor = divisor<<1;
        		if(divisor<0){
        			break;
        		}
        	}
        	re += 1<<count;
        	dividend -= (divisor>>>1);
        	divisor = divisor>>>(count+1);
        	count = -1;
        }
        return flag==flag2?re+d:(-re)-d;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideTwoIntegers.divide(-2147483648,-1109186033);
	}

}
