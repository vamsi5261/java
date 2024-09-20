package streamapi;
//stream api's are used to do some operations on collections.
import data.Student;
import data.StudentDataBase;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
public class streamApi {

	public static void main(String[] args) {
		Map<String,List<String>> list=StudentDataBase.getAllStudents().stream()
				.filter(student->student.getGradeLevel()>=3)
				.collect(Collectors.toMap(Student::getName,Student::getActivities));
		//collect is the terminal operation which actually starts the process.
		//streams have a fixed data i.e, u can't add or modify the data.And are very lazy
    System.out.println(list);
	}

}
