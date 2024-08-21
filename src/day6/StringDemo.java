package day6;

public class StringDemo {
	
	void test () {
		System.out.println("test method");}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /* way to create object on string
   * 1. string literal
   * 2. New keyword 
   */
		String s2=new String("C++"); 
		System.out.println(s2);
		
		String s="java";// string literal
		String s1="PYTHON";
		String s3="java";
	   	//index    0123
		String s4="java";
		String s5="welcome java";
		//index	   01234567891011
		
		System.out.println("Length of srting is:"+s3.length());
		System.out.println("Length of srting is:"+s1.length());
		System.out.println("s3.charAT(0)");
		System.out.println(s3.concat(s1));
		System.out.println("s3");
	    System.out.println("java");
	    System.out.println(s);
		System.out.println("s1");
		//System.out.println("test method");
		//System.out.println("test method");
		//System.out.println("test method");
		//System.out.println("test method");
		
		
	}
	
	
	
	
	

}
