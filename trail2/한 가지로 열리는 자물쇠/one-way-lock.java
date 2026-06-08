import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();

        int openCount = 0;

        // i, j, k는 우리가 맞춰볼 자물쇠 조합 후보
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    
                    // 한 자리라도 주어지는 조합과 숫자의 차이가 2 이내라면 카운트 증가
                    if (Math.abs(i - c1) <= 2 || 
                        Math.abs(j - c2) <= 2 || 
                        Math.abs(k - c3) <= 2) {
                        openCount++;
                    }
                    
                }
            }
        }

        System.out.println(openCount);
    }
}