package sorting;

public class ValidNumber {
	public boolean isNumber(String s) {
		s = s.trim();
		if("".equals(s)){
			return false;
		}
        if(s.contains("e")){
        	if(s.endsWith("e")){
        		return false;
        	}
        	String[] q = s.split("e");
        	if(q.length!=2){
        		return false;
        	}else{
        		return isNumAndAll(q[0])&&isNum(q[1],true);
        	}
        }else{
        	return isNumAndAll(s);
        }
    }
	private boolean isNumAndAll(String sb){
		if("".equals(sb)){
			return false;
		}
		if(sb.contains(".")){
			if(sb.startsWith(".")){
				return isNum(sb.substring(1),false);
			}else if(sb.endsWith(".")){
				return isNum(sb.substring(0,sb.length()-1),true);
			}else{
				String[] q = sb.split("\\.");
				if(q.length!=2){
					return false;
				}else{
					return isNum(q[1],false)&&(q[0].equals("+")||q[0].equals("-")||isNum(q[0],true));
				}
			}
		}else{
			return isNum(sb,true);
		}
	}
	private boolean isNum(String sb,boolean b){
		if("".equals(sb)){
			return false;
		}
		if(sb.startsWith("-")||sb.startsWith("+")){
			if(!b){
				return false;
			}
			sb = sb.substring(1, sb.length());
		}
		if("".equals(sb)){
			return false;
		}
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)>'9'||sb.charAt(i)<'0'){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidNumber v = new ValidNumber();
		v.isNumber("0.8");
	}

}
