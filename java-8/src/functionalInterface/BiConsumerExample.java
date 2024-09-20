package functionalInterface;
import java.util.function.BiConsumer;
public class BiConsumerExample {
    public static void main(String[] args) {
    	BiConsumer<Integer,Integer> bi=(a,b)->{System.out.println("Addition "+(a+b));};
    	BiConsumer<Integer,Integer> bi1=(a,b)->{System.out.println("Division "+(a/b));};
    	BiConsumer<Integer,Integer> bi2=(a,b)->{System.out.println("Multiplication "+(a*b));};
    	bi2.andThen(bi1).andThen(bi).accept(4,2);
    }
}
