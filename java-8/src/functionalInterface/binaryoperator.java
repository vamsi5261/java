package functionalInterface;
import java.util.function.BinaryOperator;//has same usage as unary but takes 2 inputs and outputs and has max,min that takes comparator
import java.util.Comparator;
public class binaryoperator {
    static Comparator<Integer> com=(a,b)->a.compareTo(b);
	public static void main(String[] args) {
		BinaryOperator<Integer> bi=(a,b)->a*b;
		BinaryOperator<Integer> max=BinaryOperator.maxBy(com);
		BinaryOperator<Integer> min=BinaryOperator.minBy(com);
		System.out.println("Binary Operator: "+bi.apply(3, 4));
		System.out.println("Max: "+max.apply(3, 4));
		System.out.println("Min: "+min.apply(3, 4));
	}

}
