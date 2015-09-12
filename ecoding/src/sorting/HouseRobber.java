package sorting;

import java.util.Arrays;

public class HouseRobber {
	public int rob(int[] nums) {
		if(nums.length == 0){
			return 0;
		}
        int t[] = new int[nums.length+1];
        Arrays.fill(t,-1);
		help(nums,t,0);
		return t[0];
    }
	private void help(int[] nums,int t[],int n){
		if(n==nums.length-1){
			t[n] = nums[n];
			return;
		}
		if(n==nums.length){
			t[n] = 0;
			return;
		}
		if(t[n+2]==-1){
			help(nums,t,n+2);
		}
		if(t[n+1]==-1){
			help(nums,t,n+1);
		}
		if(nums[n]+t[n+2]>=t[n+1]){
			t[n] = nums[n]+t[n+2];
		}else{
			t[n] = t[n+1];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseRobber h = new HouseRobber();
		int []nums = {2,1};
		h.rob(nums);
	}

}
