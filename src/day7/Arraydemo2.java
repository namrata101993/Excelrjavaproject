package day7;

public class Arraydemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names= {"namrata","sanil","aru","pihu"};
        System.out.println(names.length);
        System.out.println(names [3]);
        
        System.out.println("printing an array for each loop");
        for(String a:names) {
        	  System.out.println(a);
        	
	}
        System.out.println("printing an array for loop");
        for (int i=0;i<names.length;i++) {
     	   System.out.println(names[i]);
        }
        System.out.println("printing array in reverse");
        for(int i=names.length-1;i>=0;i--) {
     	   System.out.println(names[i]);
	}
}}
