package sorting;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	private List<List<Integer>> list = new ArrayList<List<Integer>>();
	public List<List<Integer>> combine(int n, int k) {
        for(int i=0;i<n;i++){
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(i+1);
        	help(list,k,n,i+1);
        }
        return this.list;
    }
	private void help(List<Integer> list,int k,int n,int p){
		if(list.size()==k){
			List<Integer> l = new ArrayList<Integer>();
			l.addAll(list);
			this.list.add(l);
			return;
		}
		if(p>=n){
			return;
		}
		for(int i=p+1;i<=n;i++){
			list.add(i);
			help(list,k,n,i);
			list.remove(list.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combinations c = new Combinations();
		c.combine(2, 2);
	}

}
