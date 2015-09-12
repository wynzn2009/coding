package lo.java.classTest;

public class InitClass {
	private static int a;
	private static int b = 1;
	private int c;
	private int d = 2;
	static {
		System.out.println(a+" "+b+"sb");
		a++;
		b++;
	}
	public static void output(){
		System.out.println(a+" "+b+"sf");
	}
	{
		System.out.println(a+" "+b+"nsb");
		System.out.println(c+" "+d+"nsb");
		a++;
		b++;
		c++;
		d++;
	}
	public void outPut(){
		System.out.println(a+" "+b+"nsf");
		System.out.println(c+" "+d+"nsf");
		a++;
		b++;
		c++;
		d++;
	}
	public InitClass(){
		System.out.println(a+" "+b+"nsc");
		System.out.println(c+" "+d+"nsc");
		a++;
		b++;
		c++;
		d++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
