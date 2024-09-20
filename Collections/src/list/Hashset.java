//HashSet
package list;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("Andhra");
		h.add("Telangana");
		h.add("Karnataka");
		h.add("Tamil Nadu");
        System.out.println(h);
        System.out.println("Check for Andhra "+h.contains("Andhra"));
        h.remove("Tamil Nadu");
        HashSet<String> hash2= (HashSet)h.clone();
        Iterator<String> i = h.iterator();
        System.out.println("Set 1");
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        h.clear();
        System.out.println("Set1 "+h.isEmpty());
        System.out.println("Set2 "+hash2+" Size is "+hash2.size());
        //Convert hashset to an array
        String[] arr = new String[hash2.size()];
        hash2.toArray(arr);
        for(String j:arr) {
        	System.out.println(j);
        }
        //for comparing 2 hashsets for(String i:set1){ sysout(set2.contains(i)? "Yes" : "No");}
        //to retain the common elements set1.retainAll(set2);
	}

}
