package functionalInterface;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.*;
import data.Student;
public class refactormethodrefrence {
    //static Predicate<Student> pre=s->s.getGpa()>=3;
	public static Supplier<Student> studentSupplier = () -> {
        return  new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
    };
    static Predicate<Student> pre1=refactormethodrefrence::refactor;
    public static boolean refactor(Student std) {
    	return std.getGpa()>=3;
    }
	public static void main(String[] args) {
    	/*list.forEach(student->
    	{if(pre.test(student)) 
    	{System.out.println(student);}
    	});*/
		System.out.println(pre1.test(studentSupplier.get()));

	}

}
