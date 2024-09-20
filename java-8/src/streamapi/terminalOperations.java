package streamapi;
//terminal operations helps you to collect the data, foreach,min,max,collect etc are terminal operations
import data.StudentDataBase;
import data.Student;
import java.util.List;
import static java.util.stream.Collectors.toList;//import static statement allows you to access static members (fields or methods) from a class
import java.util.Comparator;
import java.util.function.Predicate;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;
import java.util.Map;
import java.util.Optional;
public class terminalOperations {
    public static String join() {//joining is used for concatination
    	return StudentDataBase.getAllStudents()
    			.stream()
    			.map(Student::getName)
    			.collect(joining());
    }//the output will be difficult to read so we have join 2 which adds delimiter ,suffix and prefix which will be more
    //readable
    public static String join2() {
    	return StudentDataBase.getAllStudents()
    			.stream()
    			.map(Student::getName)
    			.collect(joining("-","(",")"));
    }
    public static long cnt(){
    	return StudentDataBase.getAllStudents()
    			.stream()
    			.collect(counting());
    }
    public static List<String> Mapping(){
    	return StudentDataBase.getAllStudents()
    			.stream()
    			//or use this method-->.map(Student::getName).collect(toList());
    			.collect(mapping(Student::getName,toList()));
    }
    public static Optional<Student> minby(){
    	return StudentDataBase.getAllStudents()
    			.stream()
    			.collect(minBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> maxby(){
    	return StudentDataBase.getAllStudents()
    			.stream()
    			.collect(maxBy(Comparator.comparing(Student::getGpa)));
    			
    }
    public static int sum(){
    	return StudentDataBase.getAllStudents()
    			.stream()
    			.collect(summingInt(Student::getNoteBooks));
    }
    public static double avg(){
    	return StudentDataBase.getAllStudents()
    			.stream()
    			.collect(averagingDouble(Student::getGpa));
    }
    //groupBy(Classifier)
    public static void group1(){//groupby used to group the list based on the properties and returns map type
    	Map<String,List<Student>> map= StudentDataBase.getAllStudents()
    			.stream()
    			.collect(groupingBy(Student::getGender));
    	System.out.println(map);
    }
  //groupBy(Classifier,downstream)--->downstream can be of any collector
    public static void group2(){
    	Map<String,Integer> map= StudentDataBase.getAllStudents()
    			.stream()
    			.collect(groupingBy(Student::getName,summingInt(Student::getNoteBooks)));
    	System.out.println(map);
    }
    //partitionby takes predicate as an input and returns map type which contains boolean as a key
    public static void partitionby(){//same as groupby
    	Predicate<Student> gpa=s->s.getGpa()>=3.8;
    	Map<Boolean,List<Student>> map= StudentDataBase.getAllStudents()
    			.stream()
    			.collect(partitioningBy(gpa));
    	System.out.println(map);
    }
	public static void main(String[] args) {
		System.out.println("Joining 1 "+join());
		System.out.println("--------------------");
		System.out.println("Joining 2 "+join2());
		System.out.println("--------------------");
		System.out.println("Counting "+cnt());
		System.out.println("--------------------");
		System.out.println("Mapping "+Mapping());
		System.out.println("--------------------");
		System.out.println("Lowest Gpa "+minby().get());
		System.out.println("--------------------");
		System.out.println("Highest Gpa "+maxby().get());
		System.out.println("--------------------");
		System.out.println("No of notebooks "+sum());
		System.out.println("--------------------");
		System.out.println("Average Gpa "+avg());
		System.out.println("--------------------");
		group1();
		System.out.println("--------------------");
		group2();
		System.out.println("--------------------");
		partitionby();
	}

}
