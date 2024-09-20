package streamapi;
//parallel stream uses Fork/Join framework 
//in case we have unboxing and boxing methods where it converts one type to other like Integer to int we shouldnt use parallel
//stream since it takes time for the conversion and in the case where we have a mutable variable that is changing concurrently
//the result will be changed and also the duration so in these cases it's better to avoid parallel streams.
//And realtime cases its recommended to check for parallel and sequetial processing everytime.
import data.Student;
import data.StudentDataBase;
import java.util.List;
import static java.util.stream.Collectors.toList;
public class parallelstream {
    public static void sequential(){
    	long start=System.currentTimeMillis();
    	List<String> std=StudentDataBase.getAllStudents()
    			.stream()
    			.map(Student::getActivities)
    			.flatMap(List::stream)
    			.distinct()
    			.sorted()
    			.collect(toList());
    	long end=System.currentTimeMillis();
    	System.out.println("Duration for Sequential Stream "+(end-start));
    	System.out.println(std);
    }
    public static void parallel(){
    	long start=System.currentTimeMillis();
    	List<String> std=StudentDataBase.getAllStudents()
    			.stream()
    			.parallel()
    			.map(Student::getActivities)
    			.flatMap(List::stream)
    			.distinct()
    			.sorted()
    			.collect(toList());
    	long end=System.currentTimeMillis();
    	System.out.println("Duration for Parallel Stream "+(end-start));
    	System.out.println(std);
    }
	public static void main(String[] args) {
		sequential();
		System.out.println("----------------------------------------------------------");
        parallel();
	}
}
