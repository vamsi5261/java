package streamapi;
import java.util.Optional;
import java.util.Arrays;
import java.util.List;
import data.Student;
import data.StudentDataBase;
public class reduceoperation {
	public static int reduce(List<Integer> list) {
		return list.stream()
				.reduce(1,(a,b)->a*b);
	}
    public static Optional<Student> highestgpa() {
    	return StudentDataBase.getAllStudents().stream()
    			.reduce((s1,s2)->(s1.getGpa()>s2.getGpa())?s1:s2);
    }
    
    public static Optional<Integer> noofnotebooks() {
    	return StudentDataBase.getAllStudents().stream()
    			.map(Student::getNoteBooks)
    			.reduce((s1,s2)->(s1+s2));
    }
    //limit() fun limits the list to a particular value suppose its 2 then it will take only 1st 2 values
    public static Optional<Integer> lim(List<Integer> list) {
    	return list.stream()
    			.limit(2)
    			.reduce((s1,s2)->(s1+s2));
    }
    //skip doesn't take the no of values from the start of the list we mentioned and takes the remaining elements in list
    public static Optional<Integer> skp(List<Integer> list) {
    	return list.stream()
    			.skip(2)
    			.reduce((s1,s2)->(s1+s2));
    }
	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(1,3,5,7);
        System.out.println(reduce(arr));
        
        Optional<Student> std=highestgpa();
        if(highestgpa().isPresent()) {
        	System.out.println(std.get());
        }
        System.out.println(noofnotebooks().get());
        System.out.println("Result using limit "+lim(arr).get());
        System.out.println("Result using skip "+skp(arr).get());
        
	}

}
