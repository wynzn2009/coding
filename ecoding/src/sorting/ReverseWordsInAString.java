package sorting;

public class ReverseWordsInAString {
	public String reverseWords(String s) {
        if(s==null||"".equals(s)){
        	return s;
        }
        s = s.trim();
        String[] a = s.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(int i=a.length-1;i>=0;i--){
        	sb.append(a[i]);
        	sb.append(" ");
        }
        return sb.toString().trim();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
