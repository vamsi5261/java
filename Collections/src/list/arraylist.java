package list;
import java.util.*;
public class arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> arr1= new ArrayList<>();
		for(int i=10; i<=100; i=i+10) {
			arr1.add(i);//will add the elements
		}
		System.out.println("list1 "+arr1);
		
		arr1.add(2,11);//will add element 11 in index 2
		System.out.println("list1 after inserting "+arr1);
		
		arr1.set(1, 19);//will replace 19 in index 1
		System.out.println("list1 after replacing "+arr1);
		
		ArrayList<Integer> arr2= new ArrayList<>();
		arr2.add(111);
		arr2.add(222);
		System.out.println("list2 "+arr2);
		
		arr1.addAll(4, arr2);//will add list2 elements in list1 in 4th index
		System.out.println("list1 after adding list2 "+arr1);
		
		//Search for an element in a list
		if(arr1.contains(10)) {//contains will return true/false since it is boolean
			System.out.println("Element Present");
		}
		else {
			System.out.println("Not Present");
		}
	    //print the elements seperately
		for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}
		arr1.remove(4);//used to remove an element with the index
		System.out.println("After Deletion "+arr1);
	}
	
}










