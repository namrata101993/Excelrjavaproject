package day_4_23;

public class OneAnimal_ {

	//non parameterized method
	
	public void bark() {
		System.out.println ("dog is barking");
	}
	
	// parameterized method 
	
	public void age (int age) {
		System.out.println("age of dog is :"+age);
	}
	
	public int Add(int a,int b) {
		int sum=a+b;
		System.out.println("Addition is:"+sum);
		return sum;
		
	
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
        OneAnimal_ obj= new OneAnimal_();//object creation 
        	obj.bark();
        	obj.age(6);
        	obj.Add(20,50);
        	
        	
        }
        
        
	}


