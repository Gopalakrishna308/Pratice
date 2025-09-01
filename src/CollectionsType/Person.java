package CollectionsType;

import java.util.ArrayList;
import java.util.Iterator;

public class Person {
	public static void main(String[] args) {
	
		 ArrayList<String> names = new ArrayList<String>();
		 names.add("Praveen");
		 names.add("Balaji");
		 names.add("Raju");
		 names.add("Krishna");
		 names.add("");
		 System.out.println( names);
		 ArrayList<String>name=new ArrayList<String>();
		 name.addAll(names);
		 name.add("raju");
		// name.clear();
		ArrayList<String>name2=(ArrayList)names.clone();
	 
		System.out.println(names);
		 System.out.println(name2);
		 System.out.println(names.contains("Balaji"));
		 System.out.println(names.get(1));
		 System.out.println( names.indexOf("Balaji"));
	   	System.out.println( name.isEmpty());
	    
	   	Iterator<String>it=names.iterator();
	   	while (it.hasNext()) {
			System.out.println( it.next());
		 
		}
	  // 	name.remove(2);
	   	System.out.println(name);
	   	names.set(3, "Gopi");
	    System.out.println( names);
	    System.out.println(names.size());
	    names.sort(null);
	   	System.out.printf( "Hello %s!", "World");
		System.out.printf( "This is new commit");
		
	   
	
	}

}
