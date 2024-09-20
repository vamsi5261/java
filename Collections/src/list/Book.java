/*Write a Java program to create a class called "Book" 
 * with attributes for title, author, and ISBN, and methods to add and remove books from a collection.*/
package list;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    String title;
    String author;
    String ISBN;

   
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookCollection = new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 to add a book, 2 to remove a book, or 3 to quit:");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 3) {
                break;
            }

            System.out.println("Enter the book title:");
            String title = scanner.nextLine();

            System.out.println("Enter the book author:");
            String author = scanner.nextLine();

            System.out.println("Enter the book ISBN:");
            String ISBN = scanner.nextLine();

            Book book = new Book(title, author, ISBN);

            if (choice == 1) {
                bookCollection.add(book);
                System.out.println("Book added to the collection.");
                
            } else if (choice == 2) {
                bookCollection.remove(book);
                System.out.println("Book removed from the collection.");
            }
            for(Book i:bookCollection) {
            System.out.println(i.getAuthor()+" "+i.getTitle()+" "+i.getISBN());}
        }

        scanner.close();
    }
}

