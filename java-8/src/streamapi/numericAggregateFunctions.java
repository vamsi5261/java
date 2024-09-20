package streamapi;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
//boxing--converting primitive(int) type to wrapper(Integer) type
//un boxing--converting wrapper(Integer) type to primitive(int)
public class numericAggregateFunctions {
    public static List<Integer> boxing() {
    	return IntStream.rangeClosed(1, 10)
    			.boxed()
    			.collect(Collectors.toList());
    }
    public static int unboxing(List<Integer> list) {
    	return list.stream()
    			.mapToInt(Integer::intValue)//returns intstream
    			.sum();
    			
    }
	public static void main(String[] args) {
		System.out.println(boxing());
		List<Integer> arr=boxing();
		System.out.println(unboxing(arr));
	}

}
