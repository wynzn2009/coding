package lo.java.classTest;

public class InitClassChild extends InitClass {
	public static int a;
	public static int b = 0;
	{
		System.out.println(a);
		System.out.println(b);
		a=4;
		b++;
		System.out.println(a);
		System.out.println(b);
	}
	static{
		System.out.println(a);
		System.out.println(b);
		a=6;
		b++;
		System.out.println(a);
		System.out.println(b);
	}
	public InitClassChild(){
		super();
	}
	
	public void out(){
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
