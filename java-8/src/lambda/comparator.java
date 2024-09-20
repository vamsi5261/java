package lambda;
import java.util.Comparator;
public class comparator {

	public static void main(String[] args) {
	    //before java 8
		Comparator<Integer> comparator  = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b); 
            }
        };

        System.out.println(comparator.compare(2,2));
       
        //java 8
        
	   Comparator<Integer> comp=(Integer a, Integer b)->a.compareTo(b);
       System.out.println(comp.compare(3, 3));
       //-1 returns if a<b, 1 if a>b, 0 if a==b.
	}

}
