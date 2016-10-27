package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * 442 * @author wyn
 *
 */
public class FindAllDuplicatesInAnArray {
	public static List<Integer> findDuplicates(int[] nums) {
		if(null == nums || nums.length<2){
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++){
			int t = nums[i];
			while(t!=i+1){
				if(t==0){
					break;
				}
				if(t==nums[t-1]){
					result.add(t);
					nums[i] = 0;
					nums[t-1] = 0;
					break;
				}
				nums[i] = nums[t-1];
				nums[t-1] = t;
				t = nums[i];
			}
		}
		return result;
        
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,3,2,7,8,2,3,1};
		List<Integer> list = FindAllDuplicatesInAnArray.findDuplicates(a);
		System.out.println(list);
	}

}
