package sorting;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumberIII {
	public static int[] singleNumber(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
        	if(s.contains(nums[i])){
        		s.remove(nums[i]);
        	}else{
        		s.add(nums[i]);
        	}
        }
        int[] re = new int[2];
        int i = 0;
        Iterator<Integer> in = s.iterator();
        while(in.hasNext()){
        	re[i] = in.next();
        	i++;
        }
        return re;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,0};
		SingleNumberIII.singleNumber(a);
	}

}
