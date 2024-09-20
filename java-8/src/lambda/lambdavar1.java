package lambda;
import java.util.function.Consumer;

public class lambdavar1 {


    public static void main(String[] args) {

        int i=0; //Repeated varibale name not allowed i.e, already intialized variable
        //Consumer<Integer> c1 = (i) -> {
        Consumer<Integer> c1 = (a) -> {
            //int i=0;
            System.out.println(a);System.out.println(i);
        };
        c1.accept(2);

    }
}
