package Array;

public class MaxArray {
    public static void main(String[] args) {
        int [] arr={12,56,78,98,4687};;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("max:"+max);
    }
}
