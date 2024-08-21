package day8;
//can we overload main method
//yes we can 
public class MainMethodoverload {

	public static void main(int a) 
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          main(10);
	}

}


// for static method we don't have to create object.