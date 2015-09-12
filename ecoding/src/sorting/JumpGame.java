package sorting;


public class JumpGame {
	public boolean canJump(int[] nums) {
        if(nums==null){
        	return false;
        }else if(nums.length<2){
        	return true;
        }
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
        	if(max==0){
        		return false;
        	}
        	max--;
        	if(max<nums[i]){
        		max = nums[i];
        	}
        	if(max+i>=nums.length-1){
        		return true;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,1,2,0,0,1,1};
		JumpGame j = new JumpGame();
		j.canJump(a);
	}

}
