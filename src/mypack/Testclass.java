package mypack;

import day_10.Access_modifier;

public class Testclass extends Access_modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_modifier a= new Access_modifier ();
			a.method3();//public method
			
			Testclass t= new Testclass ();
			t.method3();//public
			t.method4();//protected
	}

}
