package codility;

public class MinPerimeterRectangle {

    public static void main(String[] args) {

        int N=30;
        int minP = function(N);
        System.out.println(minP);
    }

    private static int function(int n) {
        if (n<0) return 0;
        for(int i = (int) Math.sqrt(n); i>0; i--){
            System.out.println("i "+i);
            if(n%i == 0) return 2*(i+n/i);
        }
        return 0;
    }
}
