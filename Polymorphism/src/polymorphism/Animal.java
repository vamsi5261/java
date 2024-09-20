package polymorphism;
/*Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). 
 * Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.*/
public class Animal {
    public void sound(){
    	System.out.println("Animals makes sounds");
    }
	public static void main(String[] args) {
       Animal a=new Bird();
       a.sound();
       Animal b=new cat();
       b.sound();
       Animal c=new Animal();
       c.sound();
	}

}
class Bird extends Animal{
	public void sound() {
		System.out.println("Birds will Chirp");
	}
}
class cat extends Animal{
	public void sound() {
		System.out.println("Meow");
	}
}