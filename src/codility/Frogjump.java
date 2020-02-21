package codility;

public class Frogjump {
    public static void main(String[] args) {
        int X = 10, Y=85,D =30;
        int jump = solution(X,Y,D);
        System.out.println(jump);

    }
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int jump = (Y-X)/D;
        if((Y-X)%D !=0) jump++;
        return jump;
    }
}
