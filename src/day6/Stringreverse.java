package day6;

public class Stringreverse {
	
	public static void main(String[] args) {
    String s="welcome";
    String rev="";
    int count= s.length();
    System.out.println(count);
    
    
    for (int i=count-1;i>=0;i--){
    	char temp=s.charAt(i);
    	rev=rev+temp;
    	
    }
    System.out.println(rev);
    System.out.println();
       if (rev.equals(s)) {
    	 System.out.println("its a palindrome");
    }
       else {
    	 System.out.println("its not a palindrome");
    	}
       }
	}
   

