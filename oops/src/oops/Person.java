//Write a Java program to create a class called "Person" with a name and age attribute. Create two 
//instances of the "Person" class, set their attributes using the constructor, and print their name 
//and age.
package oops;

public class Person {
  String name;
  int age;
  

  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  
  public void printPerson() {
      System.out.println("Name: " + this.name + ", Age: " + this.age);
  }

  public static void main(String[] args) {
      // Create two instances of Person
      Person person1 = new Person("Alice", 30);
      Person person2 = new Person("Bob", 35);

      // Print their name and age
      person1.printPerson();
      person2.printPerson();
  }
}

