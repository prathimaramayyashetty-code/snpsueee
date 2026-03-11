package CollectionFrameWork;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
         list.add(20);
    list.add(30);
    list.add(20);
        System.out.println("my arraylist:"+list);
        //get()
        System.out.println("element at index 1 is:"+list.get(1));
        //size()
        System.out.println("size:"+list.size());
        //contains()
        System.out.println("contains 30?:"+list.contains(30));
        //remove()
        list.remove(2);
        System.out.println("After removing index 2:"+list);
    }
}

