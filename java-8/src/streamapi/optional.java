package streamapi;
//Optional represents a non null value and used to avoid nullpointerexceptions and unnecessary null checks
import java.util.Optional;
import data.Student;
public class optional{
    public static Optional<String> ofNullable(){
       //ofNullable takes any type and value
       return  Optional.ofNullable("Hello");

    }

    public static Optional<String> of(){
        //it only takes the type mentioned in method name and doesn't take null
        return  Optional.of("Hello");
       // return  Optional.of(null);

    }

    public static Optional<String> empty(){

        return  Optional.empty();
        // return  Optional.of(null);

    }
    public static String optionalOrElse(){
        //Optional<Student> getOptionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());this will return 
    	//student name
        Optional<Student> optionalStudent = Optional.ofNullable(null);

        String name =  optionalStudent.map(Student::getName).orElse("Default");

        return name;
        }
    public static String optionalOrElseGet(){

        //Optional<Student> getOptionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);

        String name =  optionalStudent.map(Student::getName).orElseGet(()->"Default");
        //takes supplier as an argument which doesn't take any input just returns value
        return name;
    }
    public static String optionalOrElseThrow(){

        //Optional<Student> getOptionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);

        String name =  optionalStudent.map(Student::getName).orElseThrow(()->new RuntimeException("No Data available"));
        //will throw exception
        return name;

    }
    public static void present() {
    	Optional<String> stringOptional = Optional.ofNullable("Hello Optional");
        //is present just checks if the value is present or not
        System.out.println(stringOptional.isPresent());
        //ifpresent checks and also executes lambda expression 
        stringOptional.ifPresent((s -> System.out.println("value is : " + s)));
    }
    public static void main(String[] args) {

        System.out.println(ofNullable().get());
        System.out.println("----------------");
        System.out.println(of());
        System.out.println("----------------");
        System.out.println(empty());//since it is empty it will throw error if you try to use get method
        System.out.println("----------------");
        System.out.println(optionalOrElse());
        System.out.println("----------------");
        System.out.println(optionalOrElseGet());
        System.out.println("----------------");
        System.out.println(optionalOrElseThrow());
    }
}
