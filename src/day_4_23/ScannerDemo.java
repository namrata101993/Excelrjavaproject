package day_4_23;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter your name");
       String n=sc.nextLine();
       System.out.println("Entered name is :"+n);
       
       System.out.println("Enter your age");
       int age=sc.nextInt();
       System.out.println("Entered age is :"+age);
       
       System.out.println("Enter your city");
       String city=sc.next();
       System.out.println("Entered city is :"+city);
	}

}
