package day8;

class Animal1 {
	void eat() {
    System.out.println("Animal is eating");
	}
}

    class Dog1 extends Animal1 {
    	void bark () {
    	 System.out.println("Dog is barking");
    }
}

    class Babydog extends Dog1 {
    	void sleep () {
    		System.out.println("Babydog is sleeping");
    		
    	}
    }
    
    
    public class Multi_Leve_lnheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 dd=new Dog1();
		dd.eat();
		dd.bark();
        
        Babydog bd= new Babydog ();
        		bd.bark();
                bd.sleep ();
                bd.eat();
                
	}

}
