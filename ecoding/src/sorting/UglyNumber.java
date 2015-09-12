package sorting;

public class UglyNumber {
	public boolean isUgly(int num) {
		if(num==1){
			return true;
		}
		if(num<1){
			return false;
		}
        while(true){
        	if(num%5==0){
        		num /= 5;
        	}else{
        		break;
        	}
        }
        while(true){
        	if(num%2==0){
        		num = num>>1;
        	}else{
        		break;
        	}
        }
        while(true){
        	if(num%3==0){
        		num /= 3;
        	}else{
        		break;
        	}
        }
        if(num>1){
        	return false;
        }else{
        	return true;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
