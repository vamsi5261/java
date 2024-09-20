package functionalInterface;
import java.util.function.Function;//takes one type of input and returns other type.
public class function {
    static Function<String,String> func=(s)->s.toUpperCase();
    static Function<String,String> func1=(s)->s.toUpperCase().concat("krishna");
	public static void main(String[] args) {
	   System.out.println(func.apply("vamsi"));
	   System.out.println(func.andThen(func1).apply("vamsi"));//in case of andthen it will first executes func
	   System.out.println(func.compose(func1).apply("vamsi"));//in case of compose it will first executes the function uppercase in func1
	}

}
