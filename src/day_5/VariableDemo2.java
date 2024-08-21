package day_5;

public class VariableDemo2 {
	
	int a=20;
	int b;
	void test () {
		
		 b=30;
	}
   
	void sum () {
		
		int sum=b+20;
		System.out.println();
	}
	
	static void test0() {
		VariableDemo2 v=new VariableDemo2();
		v.b=50;
		System.out.println(v.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo2 v=new VariableDemo2();
		
		
		int b=20;
        System.out.println(b);
        System.out.println(v.a);
        v.test();
        System.out.println(v.b);//0
        v.test0();
        System.out.println(v.b);
	}

}
