package sorting;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(numRows == 0){
			return list;
		}
		List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        List<Integer> aa = new ArrayList<Integer>();
        aa.addAll(a);
        list.add(aa);
        for(int i=1;i<numRows;i++){
        	List<Integer> b = new ArrayList<Integer>();
        	b.add(1);
        	for(int j=1;j<a.size();j++){
        		b.add(a.get(j-1)+a.get(j));
        	}
        	b.add(1);
        	list.add(b);
        	a = b;
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
