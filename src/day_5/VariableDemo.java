package day_5;

public class VariableDemo {

	void test() {
	int b=10;
	System.out.println(b);
	}
	
	void test2 () {
		int b=20;
		int sum= b+10;
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) 
	{
		
         VariableDemo vd=new VariableDemo();
         int a=15;
         System.out.println(a);
         
         int c=30;
         System.out.println(c);
         vd.test();
         vd.test2();
	}

}
