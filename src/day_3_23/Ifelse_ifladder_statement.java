package day_3_23;

public class Ifelse_ifladder_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int  marks= 30;
         
         if(marks>35 && marks<60) {
        	 System.out.println("Second division");
         }
         else if(marks>60 && marks<75){
        	 System.out.println("first division");
         }
         else if(marks>75 && marks<100){
        	 System.out .println("Distinstion");
	}
         else {
        	 System.out.println("fail");
         }
	}
}
