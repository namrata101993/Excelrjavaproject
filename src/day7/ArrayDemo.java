package day7;

public class ArrayDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
        int[] age= new int[5]  ;
        System.out.println("Length of array"+age.length);
        System.out.println(age[2]);
        System.out.println(age[4]);
        
        age[0]=20;
        age[1]=25;
        age[2]=28;
        age[3]=29;
        age[4]=266;
        System.out.println(age[3]);
       System.out.println("printing an array for loop");
       for (int i=0;i<age.length;i++) {
    	   System.out.println(age[i]);
       }
       System.out.println("printing array inreverse");
       for(int i=age.length-1;i>=0;i--) {
    	   System.out.println(age[i]);
       }
       System.out.println("printing array by for each loop");
       
       for(int s:age){
       System.out.println(s);
       }
	
	}

}
