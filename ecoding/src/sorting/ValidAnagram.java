package sorting;

import java.util.HashMap;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
        	return false;
        }
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
        	if(h.containsKey(s.charAt(i))){
        		h.put(s.charAt(i), h.get(s.charAt(i))+1);
        	}else{
        		h.put(s.charAt(i), 1);
        	}
        }
        for(int i=0;i<t.length();i++){
        	if(!h.containsKey(t.charAt(i))){
        		return false;
        	}else{
        		int r = h.get(t.charAt(i));
        		if(r>0){
        			h.put(t.charAt(i), r-1);
        		}else{
        			return false;
        		}
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
