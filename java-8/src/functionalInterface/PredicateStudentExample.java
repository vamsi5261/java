package functionalInterface;
import java.util.List;
import java.util.function.*;
import data.Student;
import data.StudentDataBase;
public class PredicateStudentExample {
    static Predicate<Student> p1=(s)->s.getGradeLevel()>=3;
    static Predicate<Student> p2=(s)->s.getGpa()>=4;
    static Predicate<Student> p3=(s)->s.getGender()=="male";
    
    public static void filter() {
    	List<Student> list=StudentDataBase.getAllStudents();
    	list.forEach(student->
    	{if(p1.and(p2).and(p3).test(student)) 
    	{System.out.println(student);}
    	});
    }
    
    public static void filterbygrade() {
    	List<Student> list=StudentDataBase.getAllStudents();
    	list.forEach(student->
    	{if(p1.test(student)) 
    	{System.out.println(student);}
    	});
    }
    
    public static void filterbygpa() {
    	List<Student> list=StudentDataBase.getAllStudents();
    	list.forEach(student->{if(p2.test(student)) {System.out.println(student);}});
    }
    
    public static void filterbygender() {
    	List<Student> list=StudentDataBase.getAllStudents();
    	list.forEach(student->{if(p3.test(student)) {System.out.println(student);}});
    }
	
    public static void main(String[] args) {
		System.out.println("BY GRADE");
		filterbygrade();
		System.out.println("BY GPA");
		filterbygpa();
		System.out.println("BY GENDER");
		filterbygender();
		System.out.println("BY GRADE AND GPA AND GENDER");
		filter();
	}

}
