package streamapi;
import data.Student;
import data.StudentDataBase;
import java.util.Optional;
public class find {
    public static Optional<Student> findany(){
    	return StudentDataBase.getAllStudents().stream()
    			.filter(s->s.getGpa()>=3.9)
    			.findAny();//here this function doesn't check all the elements if the element found it just stops there
    }
    public static Optional<Student> findfirst(){
    	return StudentDataBase.getAllStudents().stream()
    	
    			.findFirst();
    }
	public static void main(String[] args) {
		Optional<Student> std=findany();//return 1st encountered in the stream
		Optional<Student> std1=findfirst();//return 1st element in stream
		if(std.isPresent()) {
			System.out.println(std.get());
			
		}else {
			System.out.println("Student not found");
		}
		if(std1.isPresent()) {
			System.out.println(std1.get());
			
		}else {
			System.out.println("Student not found");
		}
	}

}
