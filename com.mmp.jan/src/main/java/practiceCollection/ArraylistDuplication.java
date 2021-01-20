package practiceCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ArraylistDuplication {

	public static void main(String[] args) {
	List<Integer> ls= new ArrayList<>();
	//Add method to add the elements to the list
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(40);
	ls.add(10);
	ls.add(60);
	ls.add(20);
	ls.add(40);
/*System.out.println(ls);
	System.out.println(ls.get(4));
	//SET method for updating the objects
    //ls.set(2,200);
	//System.out.println(ls);
	//addAll method to append to lists
	ArrayList<Integer> ls1= new ArrayList<Integer>();
	ls1.add(90);
	ls1.add(100);
	ls.addAll(ls1);
//	System.out.println(ls);
	ls.remove(6);
	System.out.println(ls);
//	ls.removeAll(ls1);
//	System.out.println(ls);
	checking duplicates in the code*/
	List<String> duplicate= new ArrayList<>();
	duplicate.add("vani");
	duplicate.add("seshu");
	duplicate.add("seshu");
	duplicate.add("seshu");
	System.out.println(duplicate);
	Set<String> s= new HashSet<>();
	System.out.println("checking for duplicates in the given array");
	for(String T:duplicate)
	{
		
		if((s.add(T)) == false)
			
			System.out.println(T);
	}
	}

	
	
	
	
}
