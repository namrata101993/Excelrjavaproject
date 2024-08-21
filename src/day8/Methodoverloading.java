package day8;


//method overloading by changing number of argument
 
class Methodoverloading {

	void add(int a,int b) {
		int sum=a+b;
		System.out.println("sum is :"+sum);
	}
	void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("sum is :"+sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading m=new Methodoverloading();
		m.add(20, 5);
		m.add(55, 10, 20);
	}

}
