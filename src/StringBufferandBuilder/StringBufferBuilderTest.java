package StringBufferandBuilder;

public class StringBufferBuilderTest {
    public static void main(String[] args) {

        //StringBuffer
        long startTime=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer("Hello");
        for(int i=0;i<100000000;i++){
            sbf.append("World");
        }
        long stopTime=System.currentTimeMillis();
        System.out.println("Time taken by SBF:"+(stopTime-startTime)+"ms");

        //StringBuilder
        startTime=System.currentTimeMillis();
        StringBuilder sbl=new StringBuilder("Hello");
        for(int i=0;i<100000000;i++){
            sbl.append("World");
        }
        stopTime=System.currentTimeMillis();
        System.out.println("Time taken by SBL:"+(stopTime-startTime)+"ms");

    }
}
