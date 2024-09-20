package streamapi;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
public class numericstreams {
    public static int intstream() {
    	return IntStream.rangeClosed(1,6)//returns 6 elements from 1 to 6
    			.sum();
    }
    public static long cnt() {
    	//return LongStream.rangeClosed(1,6)//returns 6 elements from 1 to 6
    			//.count();
    	return LongStream.range(1,6)
    			.count();
    }
    public static int intstream1() {
    	return IntStream.range(1,6)//returns 5 elements from 1 to 5
    			.sum();//same for long stream but for double stream it doesn't support any range methods.
    }
    
	public static void main(String[] args) {
		System.out.println(intstream()); 
		IntStream.rangeClosed(1, 10).forEach(i->System.out.println(i));
		System.out.println(intstream1()); 
		System.out.println(cnt());
		System.out.println("Sum is "+IntStream.rangeClosed(1,6).sum());
		System.out.println("Maximum Value is "+IntStream.rangeClosed(1,6).max().getAsInt());
		System.out.println("Minimum Value is "+IntStream.rangeClosed(1,6).min().getAsInt());
		System.out.println("Average Value is"+IntStream.rangeClosed(1,6).average().getAsDouble());
	}
}
