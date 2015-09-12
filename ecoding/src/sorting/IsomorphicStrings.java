package sorting;

import java.util.HashMap;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> a = new HashMap<Character,Integer>();
        HashMap<Character, Integer> b = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
        	int ss = -1;
        	int tt = -1;
        	if(a.containsKey(s.charAt(i))){
        		ss = (Integer) a.get(s.charAt(i));
        	}else{
        		a.put(s.charAt(i), i);
        	}
        	if(b.containsKey(t.charAt(i))){
        		tt = (Integer) a.get(s.charAt(i));
        	}else{
        		b.put(t.charAt(i), i);
        	}
        	if(ss!=tt){
        		return false;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
