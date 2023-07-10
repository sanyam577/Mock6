package in.ineuron;

class Animal {
	public void makeSound() {
		System.out.println("sound made by the animal");
	}
}

class Dog extends Animal {
	@Override

	public void makeSound() {
		System.out.println("sound made by the dog");
	}

}
class Cat extends Animal {
	@Override
	
	public void makeSound() {
		System.out.println("sound made by the Cat");
	}
	
}
class Cow extends Animal {
	@Override
	
	public void makeSound() {
		System.out.println("sound made by the cow");
	}
	
}


public class Mock_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a= new Animal();
		Animal a1= new Dog();
		Animal a2= new Cat();
		Animal a3= new Cow();
		
		a.makeSound();
		a1.makeSound();
		a2.makeSound();
		a3.makeSound();
		

	}

}
