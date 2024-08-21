package day_10;

public class Access_modifier {
	 
	private void method1() {
  	   System.out.println("private method");
     }
     
     void method2() {
  	   System.out.println("default method ");
     }
  	   
  	   public void method3 () {
      	   System.out.println("public method");
  	   }
      	   
      	   protected void method4 () {
          	   System.out.println("protected method");
      	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       Access_modifier a= new Access_modifier ();
       a.method1();
       a.method2();
       a.method3();
       a.method4();

	}
}
