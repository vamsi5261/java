/*Write a Java program to create a class 
 * called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.*/
package inheritance;
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
    public static class Cat extends Animal {
        //@Override
        public void makeSound() {
            System.out.println("The cat barks");
        }
    }

    public static void main(String[] args) {
      Animal cat = new Cat();//if u write override u can use Cat cat=new Cat(); or else use parentclass reference to override
      cat.makeSound();
    }
}

