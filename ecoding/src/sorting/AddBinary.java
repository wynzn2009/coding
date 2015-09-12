package sorting;

public class AddBinary {
	public static String addBinary(String a, String b) {
		String c = "";
		if(a.length()>b.length()){
			c = a;
			a = b;
			b = c;
		}
        String s = "";
        int temp = 0;
        for(int i=a.length()-1,j=b.length()-1;i>=0;i--,j--){
        	int aa = a.charAt(i)-'0';
        	int bb = b.charAt(j)-'0';
        	s = (aa+bb+temp)%2 + s;
        	if(aa+bb+temp>=2){
        		temp = 1;
        	}else{
        		temp = 0;
        	}
        }
        for(int i=b.length()-a.length()-1;i>=0;i--){
        	int bb = b.charAt(i)-'0';
        	s = (bb+temp)%2 + s;
        	if(bb+temp>=2){
        		temp = 1;
        	}else{
        		temp = 0;
        	}
        }
        if(temp==1){
        	s = 1 + s;
        }
        return s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1010";
		String b = "1011";
		AddBinary.addBinary(a, b);
	}

}
