package day_10;

class student {
	 
	private int id;
	private String name;
	
	public void setID (int i) {
		id =i;
		
	}
	
	public int getID () {
		return id;
	}
	public void setID (String n ) {
		name =n;
		
	}
	
	public String getName () {
		return name;
	}
}


public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student s=new student ();
        s.setID(1);
        System.out.println("Id is :"+s.getID());
        s.setID("Namrata");
        System.out.println("Name is :"+s.getName());	
	}

}
