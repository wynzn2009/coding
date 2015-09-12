package sorting;

public class MissingNumber {
	public int missingNumber(int[] nums) {
        int k = nums.length;
        int total = k*(k+1)/2;
        int sum = 0;
        for(int i=0;i<k;i++){
        	sum += nums[i];
        }
        return total - sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
