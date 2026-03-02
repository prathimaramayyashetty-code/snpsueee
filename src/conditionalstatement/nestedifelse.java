package conditionalstatement;

public class nestedifelse {
    public static void main(String[] args) {
        int a=4;
        if (a>7){
            if (a<20) {
                System.out.println("morning");
            }else{
                    System.out.println("afternoon");
                }
            }else{
            System.out.println("evening");
        }
    }
}
