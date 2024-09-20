/*Write a Java program to create a class called Shape with a method called getArea(). 
 * Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.*/
package inheritance;

public class Shape {
	int length=12;
	int width=12;
	int area;
	public void getArea() {
		area=length+width;
		System.out.println(area);
	}
	public static class rectangle extends Shape{
		public void getArea() {
			area=length*width;
			System.out.println(area);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape ar=new rectangle();
        ar.getArea();
	}

}
