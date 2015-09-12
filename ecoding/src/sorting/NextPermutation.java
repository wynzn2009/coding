package sorting;

import java.util.Arrays;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
        if(null==nums||nums.length<2){
        	return;
        }
        int p = 0;
        int s[] = new int[2*nums.length];
        Arrays.fill(s, nums.length-1);
        for(int i=nums.length-1;i>0;i--){
        	if(nums[i]<=nums[i-1]){
        		Arrays.fill(s, nums[s[nums[i]]],2*nums.length, i);
        		continue;
        	}else{
        		p = i;
        		Arrays.fill(s, nums[s[nums[i]]],2*nums.length, i);
        		int t = nums[i-1];
        		nums[i-1] = nums[i-1]^nums[s[t]];
            	nums[s[t]] = nums[i-1]^nums[s[t]];
            	nums[i-1] = nums[i-1]^nums[s[t]];
        		break;
        	}
        }
        for(int i=nums.length-1,j=p;i>j;i--,j++){
        	nums[i] = nums[i]^nums[j];
        	nums[j] = nums[i]^nums[j];
        	nums[i] = nums[i]^nums[j];
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,1};
		NextPermutation n = new NextPermutation();
		n.nextPermutation(a);
	}

}
