package multipleinheritance;

public class interfaces implements interface1,interface2,interface3{
//a class can implements only one class but a class can implement many interfaces
	public static void main(String[] args) {
	  interfaces interfac=new interfaces();
	  interfac.method1();
	  interfac.method2();
	  interfac.method3();
	}

}
