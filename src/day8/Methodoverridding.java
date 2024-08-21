package day8;
  
class N{
  void nam() {
	  System.out.println("nam method");
  }}
  class S extends N {
	  void nam () {
		  System.out.println("san method");
	  }

public class Methodoverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      S s=new S();
      s.nam();
      
      
      
	}

}
  }

