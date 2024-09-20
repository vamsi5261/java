package functionalInterface;
public class functionex {
    public static String ex(String str) {
    	return function.func.apply(str);//code resuability using lambda
    }
	public static void main(String[] args) {
        String result=ex("function");
        System.out.println(result);
	}

}
