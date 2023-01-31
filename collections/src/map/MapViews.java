package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map; 
import java.util.Set;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

public class MapViews {
	public static void main(String[] args) {   
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
	    Calendar calendar = new GregorianCalendar(2013,2,28,13,24,56);

	    int year       = calendar.get(Calendar.YEAR);
	    int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
	    int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
	    int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
	    int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
	    int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

	    int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
	    int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
	    int minute     = calendar.get(Calendar.MINUTE);
	    int second     = calendar.get(Calendar.SECOND);
	    int millisecond= calendar.get(Calendar.MILLISECOND);
	        
	    System.out.println(sdf.format(calendar.getTime()));
		Map<String, String> map = new LinkedHashMap<String, String>(); 
		
		map.put("John", "(342)113-9878");           
		map.put("Richard", "(245)890-9045");       
		map.put("Donna", "(205)678-9823");        
		map.put("Ken", "(205)678-9827");
		map.put("Ken", "(205)678-9823");
		
	//	map.put(12, "(205)678-9823");
		
                System.out.println("Map: " + map.toString());
 
                // Print keys, values, and entries in the map 
                listKeys(map);          
                listValues(map);      
                listEntries(map);     
                }
 
        public static void listKeys(Map<String,String> map) {      
        	System.out.println("Key Set:");         
        	
        	Set<String> keys = map.keySet();  
        	
     Iterator <String> iterator =    keys.iterator();
        	
     while( iterator.hasNext()) {
    	 
    	 String key = (String) iterator.next();
    	 
    	 System.out.println(key );   
    	 
     }
        
        	   
        	}

 
        public static void listValues(Map<String,String> map) {    
        	System.out.println("Values Collection:");   
        	
        	Collection<String> values = map.values(); 
        	
        	  Iterator <String>iterator =    values.iterator();
          	
        	     while( iterator.hasNext()) {
        	    	 
        	    	 String value= (String) iterator.next();
        	    	 
        	    	 System.out.println(value );   
        	    	 
        	     }   
        	System.out.println();       
        	}
        
        public static void listEntries(Map<String,String> map) {     
        	System.out.println("Entry Set:");
        
        // Get the entry Set   
        	Set < Map.Entry <String, String>  >  entries = map.entrySet();     
        	
          
        	
        	Iterator <Map.Entry <String, String>>iterator =    entries.iterator();
          	
   	     while( iterator.hasNext()) {
   	    	 
   	    	Map.Entry<String, String> entry = (Map.Entry <String, String>) iterator.next();
   	    	String key = entry.getKey(); 
   	    	 System.out.println(key );   
   	    	String value = entry.getValue();    
   	     System.out.println(value ); 
   	     }   
   	System.out.println();       
   	
        	} 
        }
 