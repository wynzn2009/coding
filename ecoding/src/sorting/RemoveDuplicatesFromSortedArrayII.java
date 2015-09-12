package sorting;


public class RemoveDuplicatesFromSortedArrayII {
	public static int removeDuplicates(int[] nums) {
		int count = 0;
		int temp = Integer.MIN_VALUE;
		int b = 0;
		int sum = 0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>temp){
        		temp = nums[i];
        		count = 1;
        		nums[b++] = nums[i];
        		sum++;
        	}else{
        		if(count<2){
        			nums[b++] = nums[i];
        			count++;
        			sum++;
        		}
        	}
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1};
		RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums);
	}

}
