package Recursion.BackTracking;
import java.util.ArrayList;
import java. util.List;

public class ArraySubSet {
    static void ArraySubSet(int[] arr,int index,List<Integer>current){
        if (index==arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        ArraySubSet(arr,index+1,current);
        current.remove(current.size()-1);
        ArraySubSet(arr,index+1,current);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        int index=0;
        ArraySubSet(arr,index, new ArrayList<>());

    }
}
