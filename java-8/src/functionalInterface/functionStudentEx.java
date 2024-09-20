package functionalInterface;
import data.StudentDataBase;
import data.Student;
import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class functionStudentEx {
    static Function<List<Student>,Map<String,Double>> getgpa=(s->{
    	Map<String,Double> gpa=new HashMap<>();
    	s.forEach(i->{
    		if(PredicateAndConsumerExample.p2.test(i)) {
    			gpa.put(i.getName(), i.getGpa());
    		}
    	});
    	return gpa;
    });
    static Function<List<Student>,Map<String,List<String>>> list=(s->{
    Map<String,List<String>> act=new HashMap<>();
    s.forEach(i ->act.put(i.getName(),i.getActivities()));
    return act;
    });
    static Function<List<Student>,Map<String,Integer>> getgrades=(s->{
    	Map<String,Integer> grades=new HashMap<>();
    	s.forEach(i -> {

            if(PredicateAndConsumerExample.p1.test(i)){
                grades.put(i.getName(),i.getGradeLevel());
            }
        });
    	return grades;
    });
	public static void main(String[] args) {
		System.out.println(getgpa.apply(StudentDataBase.getAllStudents()));
		System.out.println(list.apply(StudentDataBase.getAllStudents()));
		System.out.println(getgrades.apply(StudentDataBase.getAllStudents()));
	}

}
