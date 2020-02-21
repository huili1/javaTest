package codility;

public class PermCheck {
    public static void main(String[] args) {
        int[] A = {4,1,2,2};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int len= A.length;
        int num=0;
        for(int i:A) {
            if(i<1 && i>len) return 0;
            if(num<i) num=i;
        }
        if(num == len) return 1;
        return 0;
    }
}
