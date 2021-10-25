package first;

class Animal { // Superclass (parent)
	  public void Sound() {
	    System.out.println("The animal makes a sound");
	  }
	}

class Dog extends Animal { // Subclass (child)
	  public void animalSound() {
	    super.Sound(); // Call the superclass method
	    System.out.println("The dog says: bow wow");
	  }
	}
class Cat extends Dog { // Subclass (child)
	  public void CatSound() {
	    super.animalSound(); // Call the superclass method
	    System.out.println("meow meow");
	  }
	}
class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat mycat = new Cat(); // Create a Dog object
	    mycat.CatSound(); // Call the method on the Dog object
	}

}
