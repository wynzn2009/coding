package sorting;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {
	public String fractionToDecimal(int numerator, int denominator) {
        long numer = Math.abs((long)numerator);
        long deno = Math.abs((long)denominator);
        boolean flag = ((numerator&(1<<31))^(denominator&(1<<31)))==(1<<31)?true:false;
        if(numer==0){
        	return "0";
        }
        StringBuilder s = new StringBuilder();
        s.append(numer/deno);
        if(numer%deno==0){
        	return flag?"-"+s.toString():s.toString();
        }else{
        	s.append(".");
        }
        String d = "";
        long t = numer%deno;
        Map<Long,Integer> map = new HashMap<Long,Integer>();
        while(t!=0){
        	if(map.containsKey(t)){
        		int index = (Integer) map.get(t);
        		String dd = d.substring(index);
        		d = d.substring(0, index);
        		d = d + "(" + dd + ")";
        		return flag?"-"+s.append(d).toString():s.append(d).toString();
        	}else{
        		map.put(t, d.length());
        	}
        	t *= 10;
        	d = d + t/deno;
        	t = t%deno;
        }
        return flag?"-"+s.append(d).toString():s.append(d).toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
