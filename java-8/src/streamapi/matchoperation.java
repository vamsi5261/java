package streamapi;
//match used to check elements in stream which takes predicate input and returns a boolean value.
//limit,match,find methods are short circuit methods since they doesn't check every element in stream.
import data.StudentDataBase;
public class matchoperation {
    public static boolean allmatch() {
    	return StudentDataBase.getAllStudents().stream()
    			.allMatch(s->s.getGpa()>=3.9);
    }
    public static boolean anymatch() {
    	return StudentDataBase.getAllStudents().stream()
    			.anyMatch(s->s.getGpa()>=3.9);
    }
    public static boolean nonematch() {
    	return StudentDataBase.getAllStudents().stream()
    			.noneMatch(s->s.getGpa()==5.0);
    }
	public static void main(String[] args) {
		System.out.println("All Match "+allmatch());
		System.out.println("Any Match "+anymatch());
		System.out.println("None Match "+nonematch());
	}

}
