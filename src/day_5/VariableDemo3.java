package day_5;

public class VariableDemo3 {

	static int a=10;
	
	static void demo() {
	System.out.println("static method"); 
	
	}
	static void demo1() {
		System.out.println("non static method"); 
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         demo();
         System.out.println("a"); 
         System.out.println(VariableDemo3.a); 
	}

}
