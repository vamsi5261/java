//basic operations on hashmap
package list;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"One");
		map.put(2,"Two");
		map.put(3,"Three");
		map.put(4,"Four");
		for (Map.Entry<Integer, String> e : map.entrySet()) { 
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());}
		map.remove(4);
		map.put(5, "Five");
		System.out.println(map);
		System.out.println(map.containsKey(6));
		System.out.println(map.containsValue("Five"));
		System.out.println(map.clone());
		System.out.println(map.size());
		HashMap<Integer,String> map2=new HashMap<>();
		map2.putAll(map);
		map.clear();
		System.out.println("First map is"+map);
		System.out.println("Second map is"+map2);
		System.out.println(map.isEmpty());
		System.out.println(map2.isEmpty());
		System.out.println(map2.values());
		System.out.println(map2.get(3));
	}

}
