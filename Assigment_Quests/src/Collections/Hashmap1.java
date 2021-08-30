package Collections;

import java.util.HashMap;
import java.util.Map;


public class Hashmap1 {
	
	public static void main(String args[])
	{
	
	
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1, "test");
	hm.put(2, "new");
	hm.put(null, "yu");
	hm.put(null, "ju");
	hm.put(3, null);
	hm.put(4, null);
	System.out.println(hm);
	//Multiple null values are allowed but only one null key is allowed
}
	
	

}
