package sorting;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
        String sb = "";
        while(n>0){
        	char a = (char) ('A'+ (n-1)%26) ;
        	sb = a + sb;
        	n = (n-1)/26;
        }
        return sb;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
