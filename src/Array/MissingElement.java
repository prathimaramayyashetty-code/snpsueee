package Array;

public class MissingElement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5};
        int n = 5;   // total numbers from 1 to 5

        int totalSum = n*(n + 1)/2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        System.out.println("Missing element is: " + (totalSum-actualSum));
    }
}
