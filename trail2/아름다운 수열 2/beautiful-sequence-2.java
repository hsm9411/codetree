import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] cntB = new int[101];

        int[] arrA = new int[N];
        int[] arrB = new int[M];

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }
        
        for (int i = 0; i < M; i++) {
            arrB[i] = sc.nextInt();
        }

        //B 원소 갯수세기

        for (int i = 0; i < M; i++) {
            cntB[arrB[i]]++;
        }

        int res = 0;
        for (int i = 0; i <= N - M; i++) {
            int[] cntA = new int[101];

            for (int j = i; j < i + M; j++) {
                cntA[arrA[j]]++;
            }

            if (Arrays.equals(cntA, cntB)) {
                res++;
            }
        }

        System.out.println(res);
    }
}
