package sorting;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length<2){
        	return false;
        }
		Set<Integer> m = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
        	if(m.contains(nums[i])){
        		return true;
        	}else{
        		m.add(nums[i]);
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
