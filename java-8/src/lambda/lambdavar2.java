package lambda;
import java.util.function.Consumer;

public class lambdavar2 {

    static int value =4;// it is an instance variable so it can be modified 

    public static void main(String[] args) {


        // int value =4; //effectively final so for this type of initialization value can't be modified
        Consumer<Integer> c1 = (a) -> {
            value++;//it will be incremented since value is an instance variable 
            System.out.println(a+value);
        };
        //value =2;

        c1.accept(2);
    }
}
