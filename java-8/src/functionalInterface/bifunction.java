package functionalInterface;
import data.StudentDataBase;
import data.Student;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class bifunction {
    static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> getgpa=(s,predicate)->{
    	Map<String,Double> gpa=new HashMap<>();
    	s.forEach(i->{
    		if(predicate.test(i)) {
    			gpa.put(i.getName(), i.getGpa());
    		}
    	});
    	return gpa;
    };
    
	public static void main(String[] args) {
		System.out.println(getgpa.apply(StudentDataBase.getAllStudents(),PredicateAndConsumerExample.p2));
		
	}

}
