package codility;

import java.util.ArrayList;
import java.util.List;

public class ChocolatesByNumbers {
    public static void main(String[] args) {
    int N=1, M=2;
    int x= solution(N,M);
        System.out.println(x);
    }

    private static int solution(int N, int M) {
       // if (N<M) return 0;
        //if(N==M) return 1;
        List<Integer> l =new ArrayList<>();
        int pos=0;
        int num=0;
        while (!l.contains(pos)){
            num++;
            l.add(pos);
            pos= (pos+M)%N;
        }
        return num;
    }
}
