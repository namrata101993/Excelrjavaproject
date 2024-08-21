package day_4_23;

public class MethodDemo {

	//Static method
	
	public static void print ()
	{
		System.out.println("this is print method");
	}
	
	//non static
	
	public  void Non ()
	{
		System.out.println("Non");
	}
	
	public  void Non1 ()
	{
		print();
		Non();
		System.out.println("Non1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MethodDemo m=new MethodDemo();
       OneAnimal_ obj= new OneAnimal_();
       obj.age(6);
       m.Non();
      // m.print();
       print();
	}

}
