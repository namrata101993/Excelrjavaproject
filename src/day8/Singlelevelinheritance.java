package day8;

class Animal {
	void eat() {
    System.out.println("Animal is eating");
	}
}

    class Dog extends Animal {
    	void bark () {
    	 System.out.println("Dog is barking");
    }
}

    public class Singlelevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Dog d= new Dog();
        d.bark();
        d.eat();

	}
    }
	


