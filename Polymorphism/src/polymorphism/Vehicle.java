package polymorphism;
public class Vehicle{
    public void speedup(){
    	System.out.println("Speed");
    }
	public static void main(String[] args) {
       Vehicle a=new Vehicle();
       a.speedup();
       Vehicle b=new car();
       b.speedup();
       Vehicle c=new bicycle();
       c.speedup();
	}

}
class car extends Vehicle{
	public void speedup() {
		System.out.println("Increase speed to 100kmph");
	}
}
class bicycle extends Vehicle{
	public void speedup() {
		System.out.println("Increase speed up to 40kmph");
	}
}
