package qt;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordLadder {
	public int help(String a,String b,Set<String> dict){
		int count = 1;
		LinkedList<String> list = new LinkedList<String>() ;
		list.offer(a);
		while(!list.isEmpty()){
			LinkedList<String> list1 = new LinkedList<String>();
			String t = list.poll();
			if(this.ok(t, b)){
				return count;
			}
			this.dosomething(t,list1, dict,b.length());
			if(list.size()==0){
				list = list1;
				count++;
			}
		}
		return -1;
	}
	private void dosomething(String a,List<String> list1,Set<String> dict,int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<26;j++){
				if(dict.contains(a.substring(0, i)+(char)('a'+j)+a.substring(i+1))){
					list1.add(a.substring(0, i)+(char)('a'+j)+a.substring(i+1));
					dict.remove(a.substring(0, i)+(char)('a'+j)+a.substring(i+1));
				}
			}
		}
	}
	private boolean ok(String a,String b){
		int t = a.length();
		for(int i=0;i<t;i++){
			for(int j=0;j<26;j++){
				if(b.equals(a.substring(0, i)+(char)('a'+j)+a.substring(i+1))){
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordLadder w = new WordLadder();
		Set<String> dict = new HashSet<String>();
		dict.add("hot");
		dict.add("hop");
		dict.add("pot");
		dict.add("tot");
		dict.add("dot");
		dict.add("hog");
		dict.add("dog");
		dict.add("log");
		System.out.println(w.help("hit","cog",dict));
	}

}
