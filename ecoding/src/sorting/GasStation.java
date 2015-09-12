package sorting;

public class GasStation {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int sum = 0;  
        int total = 0;  
        int j = -1;  
        for (int i = 0; i < gas.length; i++) {  
            sum += gas[i] - cost[i];  
            total += gas[i] - cost[i];  
            if(sum < 0) {   //之前的油量不够到达当前加油站  
                j = i;  
                sum = 0;  
            }  
        }  
        if (total < 0) return -1;    //所有加油站的油量都不够整个路程的消耗  
        else return j + 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,3};
		int b[] = {2,1,5,1};
		System.out.println(GasStation.canCompleteCircuit(a,b));
	}

}
