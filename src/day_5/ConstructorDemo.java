package day_5;

public class ConstructorDemo {

	public ConstructorDemo () {
		System.out.println("constructor");
	}
	public ConstructorDemo (int a) {
		System.out.println(a);
		System.out.println("parameterized constructor");
	}
	public ConstructorDemo (int a,int b) {
		int sum=a+b;
		System.out.println(sum);
		System.out.println("2 parameterized constructor");
	}
	public void Demo(int a) {
		System.out.println("This is method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c=new ConstructorDemo();
		ConstructorDemo c1=new ConstructorDemo(20,30);
		ConstructorDemo c2=new ConstructorDemo(12,60);
		c.Demo(10);
		
	}

}
