package streamapi;
//mapToobject converts each element of stream to object
//mapTolong converts a stream to long
//mapTodouble converts a stream to double
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;
import java.util.List;
public class mapto {
    public static List<Integer> mapobj(){
    	return IntStream.rangeClosed(1, 10)
    			.mapToObj(i->{return new Integer(i);})
    			.collect(toList());
    }
    public static long maplong(){
    	return IntStream.rangeClosed(1, 10)
    			.mapToLong(i->i)
    			.count();
    }
    public static double mapdouble(){
    	return IntStream.rangeClosed(1, 10)
    			.mapToDouble(i->i)
    			.sum();
    }
	public static void main(String[] args) {
		System.out.println(mapobj());
		System.out.println(maplong());
		System.out.println(mapdouble());
	}

}
