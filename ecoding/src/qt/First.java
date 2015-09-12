package qt;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class First {
	public static String first(String str){
		if(str==null||str.length()<2){
			return str;
		}
		LinkedHashMap<Character, Character> l = new LinkedHashMap<Character, Character>();
		int[] a = new int[26];
		Arrays.fill(a, 0);
		for(int i=0;i<str.length();i++){
			if(a[str.charAt(i)-'a']==0){
				l.put(str.charAt(i),str.charAt(i));
				a[str.charAt(i)-'a'] = 1;
			}else if(a[str.charAt(i)-'a'] == 1){
				l.remove(str.charAt(i));
				a[str.charAt(i)-'a'] = 2;
			}
		}
		if(!l.isEmpty()){
			Iterator<Entry<Character, Character>> c = l.entrySet().iterator();
			return c.next().getValue().toString();
		}
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ajbvabgfoibawoijufbeovh";
		String s = First.first(str);
		System.out.println(s);
	}
}
