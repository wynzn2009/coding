/**
 * 
 */
package sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * @author wyn
 * 384
 *
 */
public class ShuffleAnArray {
	private int[] nums;
	private int[] result;
	private Random random;
	public ShuffleAnArray(int[] nums) {
        this.nums = nums;
        this.result = Arrays.copyOf(nums, nums.length);
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	this.random = new Random(System.nanoTime());
    	for(int i=0;i<nums.length;i++){
    		int t = random.nextInt(nums.length);
    		if(i==t){
    			continue;
    		}
    		result[i] = result[t]^result[i];
    		result[t] = result[t]^result[i];
    		result[i] = result[t]^result[i];
    	}
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
