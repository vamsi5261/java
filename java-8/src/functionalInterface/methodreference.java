package functionalInterface;
import java.util.function.*;
import data.StudentDataBase;
import data.Student;
public class methodreference {
	static Consumer<Student>  c1= System.out::println;
	public static double refactor(Student std) {
		return std.getGpa();
	}
	public static void main(String[] args) {// Syntax: class name::method name for predefined methods
		Function<String,String> con=String::toUpperCase;//method reference is used to simplify lambda expression
        System.out.println(con.apply("vamsi"));
        System.out.println("--------------------------");
        StudentDataBase.getAllStudents().forEach(c1);
       
	}

}
