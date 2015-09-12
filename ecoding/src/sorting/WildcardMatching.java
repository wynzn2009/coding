package sorting;

public class WildcardMatching {
	public static boolean isMatch(String s, String p) {  
	    if(p.length()==0)  
	        return s.length()==0;  
	    boolean[] res = new boolean[s.length()+1];  
	    res[0] = true;  
	    for(int j=0;j<p.length();j++)  
	    {  
	        if(p.charAt(j)!='*')  
	        {  
	            for(int i=s.length()-1;i>=0;i--)  
	            {  
	                res[i+1] = res[i]&&(p.charAt(j)=='?'||s.charAt(i)==p.charAt(j));  
	            }  
	        }  
	        else  
	        {  
	            int i = 0;  
	            while(i<=s.length() && !res[i])  
	                i++;  
	            for(;i<=s.length();i++)  
	            {  
	                res[i] = true;  
	            }  
	        }  
	        res[0] = res[0]&&p.charAt(j)=='*';  
	    }  
	    return res[s.length()];  
	} 
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		String a = "*4";
		String b[] = a.split("\\*");
		System.out.println(b.length);
		System.out.println(a.contains("*"));
		WildcardMatching.isMatch("abcdefg","*c?e*g");
	}

}
