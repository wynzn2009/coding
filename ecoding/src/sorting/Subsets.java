package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		LinkedList<Integer> l = new LinkedList<Integer>();
		Arrays.sort(nums);
		list.add(new ArrayList<Integer>(l));
		help(nums,list,l,0);
		return list;
    }
	private void help(int[] nums,List<List<Integer>> list,LinkedList<Integer> l,int n){
		for(int i=n;i<nums.length;i++){
			l.add(nums[i]);
			help(nums,list,l,i+1);
			list.add(new ArrayList<Integer>(l));
			l.remove(l.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsets s = new Subsets();
		int[] nums = {0};
		s.subsets(nums);
	}

}
