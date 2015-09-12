package sorting;

public class Candy {
	public static int candy(int[] ratings) {
		if(ratings==null||ratings.length==0){
			return 0;
		}
        int[] a = new int[ratings.length];
        int count = 0;
        int temp = Integer.MIN_VALUE;
        for(int i=0;i<ratings.length;i++){
        	if(ratings[i]>temp){
        		a[i] = ++count;
        		temp = ratings[i];
        	}else{
        		a[i] = 1;
        		count = 1;
        		temp = ratings[i];
        	}
        }
        int sum = 0;
        int count1 = 0;
        int temp1 = Integer.MIN_VALUE;
        for(int i=ratings.length-1;i>=0;i--){
        	if(ratings[i]>temp1){
        		sum += Math.max(++count1, a[i]);
        		temp1 = ratings[i];
        	}else{
        		sum += Math.max(1, a[i]);
        		count1 = 1;
        		temp1 = ratings[i];
        	}
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ratings = {1,0,2};
		Candy.candy(ratings);
	}

}
