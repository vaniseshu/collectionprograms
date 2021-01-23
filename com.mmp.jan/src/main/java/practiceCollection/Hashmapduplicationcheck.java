package practiceCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmapduplicationcheck {

	public static void main(String[] args) {
	Map<Character,Integer> duplicatecheck= new HashMap<Character,Integer>();
	
			String s="i am checking duplicate string";
			char[] chars=s.toCharArray();
			for(Character ch:chars)
			{
			      if(duplicatecheck.containsKey(ch))
			      {
			    	  duplicatecheck.put(ch,duplicatecheck.get(ch)+1);
			      } else {
			    	  duplicatecheck.put(ch, 1);
			        }
			    }
System.out.println(duplicatecheck);
			Set<Character> keys = duplicatecheck.keySet();
			for(Character ch:keys){
			      if(duplicatecheck.get(ch) > 1){
			        System.out.println("Char "+ch+" "+duplicatecheck.get(ch));
			      }
			    }
	}

}
