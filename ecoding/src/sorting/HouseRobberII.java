package sorting;

import java.util.Arrays;

public class HouseRobberII {
	public int rob(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		if(nums.length==1){
			return nums[0];
		}
		if(nums.length==2){
			return Math.max(nums[0], nums[1]);
		}
        int[] re = new int[nums.length+1];
        int[] re1 = new int[nums.length];
        int[] nums1 = Arrays.copyOf(nums, nums.length-1);
        Arrays.fill(re, -1);
        Arrays.fill(re1, -1);
        help(nums,re,0);
        help1(nums1,re1,0);
        return Math.max(re[1], re1[0]);
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
	private void help1(int[] nums,int t[],int n){
		if(n==nums.length-2){
			t[n] = nums[n];
			return;
		}
		if(n==nums.length-1){
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
		HouseRobberII h = new HouseRobberII();
		int[] nums = {1,1,1};
		h.rob(nums);
	}

}
