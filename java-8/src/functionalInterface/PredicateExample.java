package functionalInterface;
import java.util.function.Predicate;
public class PredicateExample {
   static Predicate<Integer> p=(i)->{return i%2==0;};//predicate takes an input and returns a boolean value
   static Predicate<Integer> p1=(i)->i%2==0;//return type is not required if there are no curly braces
   static Predicate<Integer> p2=(i)->i%5==0;
   public static void predicateor() {
	   System.out.println("Or");
	   System.out.println("#2 "+p1.or(p2).test(2));
	   System.out.println("#10 "+p1.or(p2).test(10));
   }
   public static void predicateand() {
	   System.out.println("And");
	   System.out.println("#2 "+p1.and(p2).test(2));
	   System.out.println("#10 "+p1.and(p2).test(10));
   }
   public static void pnegate() {
	   System.out.println("Negate");
	   System.out.println("#2 "+p1.and(p2).negate().test(2));
	   System.out.println("#10 "+p1.and(p2).negate().test(10));
   }
   public static void main(String[] args) {

		//System.out.println(p.test(4));
		//System.out.println(p1.test(4));
		predicateor();
		predicateand();
		pnegate(); //will reverse the output.
	}

}
