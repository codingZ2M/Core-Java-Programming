package map;
import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
    	
        Map<String, String> languages = new HashMap<String, String>();
       
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        
        languages.remove("Lisp");
        if(languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        

        if(languages.replace("BASIC", "Beginners All Purposes Symbolic Instruction Code", "a language with Symbolic Instruction Code")) {
            System.out.println("BASIC replaced");
        } else {
            System.out.println("BASIC was not replaced");
        }
        
        System.out.println("================================================");

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}

