package sorting;

public class GasStation {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int sum = 0;  
        int total = 0;  
        int j = -1;  
        for (int i = 0; i < gas.length; i++) {  
            sum += gas[i] - cost[i];  
            total += gas[i] - cost[i];  
            if(sum < 0) {   //֮ǰ�������������ﵱǰ����վ  
                j = i;  
                sum = 0;  
            }  
        }  
        if (total < 0) return -1;    //���м���վ����������������·�̵�����  
        else return j + 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,3};
		int b[] = {2,1,5,1};
		System.out.println(GasStation.canCompleteCircuit(a,b));
	}

}
