package codility;

import java.util.Arrays;
import java.util.List;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] A = {-3,1,2,-2,5,6};
        int i = solution(A);
        System.out.println(i);
    }

    private static int solution(int[] A) {
        Arrays.sort(A);
        int max=0;
        Integer[] b = new Integer[A.length];
        Arrays.setAll(b,i-> A[i]);
        List<Integer> l = Arrays.asList(b);

        max=l.get(A.length-3)*l.get(A.length-2)*l.get(A.length-1);
        System.out.println(max);

        if(A[0]<0 && A[1]<0 && A[0]*A[1]*A[A.length-1]> max ) max= A[0]*A[1]*A[A.length-1];


        return max;

    }
}
