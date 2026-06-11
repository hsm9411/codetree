import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. 배열을 오름차순으로 예쁘게 정렬합니다.
        Arrays.sort(arr);

        // 2. 제일 큰 수와 제일 작은 수를 순서대로 짝지어 팀을 만듭니다.
        int sum1 = arr[0] + arr[5]; // 꼴등 + 1등
        int sum2 = arr[1] + arr[4]; // 5등 + 2등
        int sum3 = arr[2] + arr[3]; // 4등 + 3등

        // 3. 세 팀 중 가장 큰 값과 작은 값 찾기
        int max = Math.max(sum1, Math.max(sum2, sum3));
        int min = Math.min(sum1, Math.min(sum2, sum3));

        // 4. 차이 출력
        System.out.println(max - min);
    }
}