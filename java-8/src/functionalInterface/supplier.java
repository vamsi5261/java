package functionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import data.Student;
import data.StudentDataBase;
public class supplier {

	public static void main(String[] args) {
		Supplier<Student> supply=()->{
			return new Student("Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));
		};
		Supplier<List<Student>> supply1=()->StudentDataBase.getAllStudents();
        System.out.println("Student: "+supply.get());
        System.out.println("Students: "+supply1.get());
        //supplier is opposite to consumer and it doesn't take any input just supply or returns something to caller
	}

}
