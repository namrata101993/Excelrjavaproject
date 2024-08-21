package day_3_23;
// +=,-=,*=,/=,%=
public class Assignment_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
       System.out.println(a+=5); //a= a+5=15
       System.out.println(a); //15
       System.out.println(b-=5); // b=b-5=15
       System.out.println(a*=2); // a=a*2=30
       System.out.println(a); //30
       
       
       //a==a+10= 40
       System.out.println(a+=10); //40
	}

}
