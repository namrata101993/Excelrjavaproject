package day_5;

public class StudentData {
	
	int id;// instance variable
	String name;// instance variable
	static String ClassName= "Excelr";//static variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData s=new StudentData();
		s.id=1;
		s.name="namrata";
		System.out.println(s.id+" "+s.name+" "+ClassName);
		
		
		s.id=2;
		s.name="nam";
		System.out.println(s.id+" "+s.name+" "+ClassName);
		
		StudentData s1=new StudentData();
		s1.id=1;
		s1.name="namrata";
		System.out.println(s1.id+" "+s1.name+" "+ClassName);
		
	}

}
