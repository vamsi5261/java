package functionalInterface;
import java.util.function.UnaryOperator;//use unary in case if u have input and output of same type no need "Function"
public class unaryoperator {
    static UnaryOperator<String> unaryOperator=(s)->s.concat("krishna");
	public static void main(String[] args) {
      System.out.println(unaryOperator.apply("vamsi"));
	}

}