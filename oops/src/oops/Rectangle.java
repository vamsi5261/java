/*Write a Java program to create a class * called "Rectangle" with width and height attributes. 
 * Calculate the area and perimeter of the rectangle.*/
package oops;
import java.util.*;
public class Rectangle {
	int height;
	int width;
	int area;
	int perimeter;
	public Rectangle(int height, int width) {
		this.height=height;
		this.width=width;
	}
    public void area(int height, int width) {
    	area=height*width;
    	System.out.println("Area "+area);
    }
    public void perimeter(int height, int width) {
    	perimeter=2*(height+width);
    	System.out.println("Perimeter "+perimeter);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		int width=sc.nextInt();
		Rectangle rec= new Rectangle(height,width);
		rec.area(height,width);
		rec.perimeter(height,width);
	    sc.close();	
	}
}
