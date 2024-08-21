package day8;
//method overloading by changing datatypes

public class Methodoverloading2 {
	
	
	void add(int a,int b) {
		int sum=a+b;
		System.out.println("sum is :"+sum);
	}
	void add(float a,int b) {
		float sum=a+b;
		System.out.println("sum is :"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading2 m=new Methodoverloading2();
		m.add(20, 5);
		m.add(55, 10);
	}

}
