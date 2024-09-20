package streamapi;
import java.util.stream.*;
import java.util.Random;
import java.util.function.Supplier;
public class factorymethods {
   
	public static void main(String[] args) {
		Stream<String> str=Stream.of("1","2","3");
        str.forEach(System.out::println);//of is a method used to take inputs in stream
        Stream.iterate(1,s->s*2)//it prints infinite values so we use limit to reduce the output values
              .limit(10)
              .forEach(System.out::println);
        Supplier<Integer> gen=new Random()::nextInt;
        Stream.generate(gen)//generate takes supplier as an input and supplier doesn't take any input just returns a value
              .limit(5)
              .forEach(System.out::println);
	}

}
