package CollectionFrameWork;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();

        //put()
        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Orange");
        System.out.println(map);

        //get()
        System.out.println(map.get(2));

        //containsKey()
        System.out.println("Contains Key 3?" + map.containsKey(3));

        //remove()
        map.remove(1);
        System.out.println(map);

    }
}
/**
 * stores the elements in key and value pairs
 * key must be unique
 * does not maintain the order of insertion
 * uses hash internally
 */
