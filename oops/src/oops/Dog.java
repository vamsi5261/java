/*Write a Java program to create a class called "Dog" with a name and breed attribute. Create two 
 * instances of the "Dog" class, set their attributes using the constructor and modify the attributes 
 * using the setter methods and print the updated values.*/
package oops;

public class Dog {
	String name;
	String breed;
	
	public Dog(String name,String breed) {
		this.name=name;
		this.breed=breed;
	}
	public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void printDog() {
    	System.out.println("Name: "+this.name+", Breed: "+this.breed);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1= new Dog("Rocky","Bulldog");
		Dog dog2= new Dog("Snoopy","German Shepherd");
		//by settermethods
		dog1.setName("Tommy");
        dog1.setBreed("labrador");
        dog2.setName("Charlie");
        dog2.setBreed("Poodle");
		dog1.printDog();
		dog2.printDog();

	}

}
