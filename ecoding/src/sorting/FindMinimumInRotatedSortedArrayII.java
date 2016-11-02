package sorting;
public class FindMinimumInRotatedSortedArrayII {
	public int findMin(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		int temp = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++){
			temp = Math.min(temp, nums[i]);
		}
        return temp;
    }
	public int findMin1(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		int temp = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++){
			if(nums[i]<temp&&temp!=Integer.MAX_VALUE){
				return nums[i];
			}
			temp = Math.min(temp, nums[i]);
		}
        return temp;
    }
	public static int findMin2(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		int l = 0;
		int r = nums.length-1;
		int m = (l+r)/2-l;
		while((m!=l||m!=r)&&l<=r){
			if(nums[l]<nums[r]){
				return nums[l];
			}
			if(nums[m]>=nums[l]){
				if(nums[m]==nums[l]&&nums[m]==nums[r]){
					l++;
					r--;
					continue;
				}
				if(nums[m]<nums[r]){
					return nums[m];
				}else{
					l=m+1;
					m=(r-l)/2+l;
				}
			}else if(nums[m]<nums[l]){
				r = m;
				m=(r-l)/2+l;
			}
		}
		return nums[m];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = {10,1,10,10,10};
		findMin2(t);
	}

}
