package practiceCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class stringworduplicate {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
	    map.put("A", "1");
	    map.put("B", "2");
	    map.put("C", "2");
	    map.put("D", "3");
	    map.put("E", "3");
	    Set<String> keys = map.keySet(); // The set of keys in the map.

	    Iterator<String> keyIter = keys.iterator();

	    while (keyIter.hasNext()) {
	        String key = keyIter.next();
	        String value = map.get(key);

	        System.out.println(key + "\t" + value);

	        String nextValue = map.get(key);

	        if (value.equals(nextValue)) {
	            map.remove(key);
	        }
	    }
	    System.out.println(map);
	}
}
