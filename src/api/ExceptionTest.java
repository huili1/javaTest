package api;

public class ExceptionTest {
    public static void main(String[] args) {
        int k;
        int j=19, i=0;
        try{
            k=j/i;
            //System.out.println(k);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            //System.out.println("cannot divide by 0 "+e);
        }


    }
}
