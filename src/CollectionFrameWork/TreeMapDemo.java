package CollectionFrameWork;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer ,String>map=new TreeMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(4,"c");
        System.out.println(map);
        //get()
        System.out.println(map.get(2));
        //firstKey()---------->Smallest Key
        System.out.println(map.firstKey());
        //lastKey()------------->largest Key
        System.out.println(map.lastKey());
    }
}
/**
 * stores the element in key and value pair
 * key must be unique
 * automatically sort the keys
 * uses hash internallu
 * uses the tree structure
 * slower than Hashmap
 */
