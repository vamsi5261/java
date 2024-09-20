package streamapi;
import java.util.*;
import data.StudentDataBase;
import data.Student;
import static java.util.stream.Collectors.toList;
public class StreamOperations {
    public static List<String> map(){//map converts element of one type to another type. 
    	return StudentDataBase.getAllStudents().stream()
    			.map(Student::getName)
    			.map(String::toUpperCase)
    			.collect(toList());
    }
    public static List<String> flatmap() {//same usage like map where each stream elements which represents multiple elements
    	return StudentDataBase.getAllStudents().stream()
    			.map(Student::getActivities)//here we will get output of list type so we use flat map
    			.flatMap(List::stream)
    			.distinct()//returns a stream of unique elements
    			.sorted()//sorts the list
    			.collect(toList());
    }
    public static long getcount(){
    	return StudentDataBase.getAllStudents().stream()
    			.map(Student::getActivities)
    			.flatMap(List::stream)
    			.count();
    }
    public static List<Student> filter(){
    	return StudentDataBase.getAllStudents().stream()
    		   .filter(student->student.getGender()=="male")
    		   .collect(toList());
    }
	public static void main(String[] args) {
		System.out.println(map());
		System.out.println(flatmap());
		System.out.println(getcount());
		System.out.println(filter());
	}

}
