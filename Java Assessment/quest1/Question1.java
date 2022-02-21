import java.security.KeyStore.Entry;
import java.util.*;

public class Question1{
    public static void main(String[] args){
        Map<Integer, String> languages = new HashMap<Integer, String>();
        languages.put(1, "Value1");
        languages.put(2, "Value2");
        languages.put(3, "Value3");
        languages.put(4, "Value4");
        languages.put(5, "Value5");


        // Iterate using forEach loop
        System.out.println("\nIterate using advanced forEach loop");
        languages.forEach((key, value)->{
            System.out.println("Key = " + key + ", Value = "+ value);
        });

        // Iterate using while loop
        System.out.println("\nIterate using While loop");
        Iterator <Integer> itr = languages.keySet().iterator();        
        while(itr.hasNext()){
            int key = (int)itr.next();
            System.out.println("Key = " + key + ", Value = "+ languages.get(key));

        }
    }
}
