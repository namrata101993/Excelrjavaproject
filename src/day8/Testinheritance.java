package day8;


class parent {
	void demo () {
		System.out.println("parent class method");
	}
}

class Child extends parent{
	void test () {
		System.out.println("child class method");
	}
}


     public class Testinheritance {

	 public static void main(String[] args) {
		parent p=new parent();
		p.demo();
    
		Child c=new Child();
        c.demo ();
         c.test ();
     
     
	}
     
     }
