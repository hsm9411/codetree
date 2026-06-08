import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        
        int[] arr = new int[n];
        
        // 1. 배열의 값 입력받기 (추가된 부분)
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        // 3. 최솟값을 안전하게 가장 큰 값으로 초기화
        int min = Integer.MAX_VALUE; 
        
        // 2. 인덱스 초과를 막고, t값에 유동적으로 대응하도록 탐색 범위 수정
        for(int i = 0; i <= n - t; i++){ 
            int temp = 0;
            
            for(int j = i; j < i + t; j++){
                temp += Math.abs(h - arr[j]);
            }
            
            min = Math.min(min, temp);
        }
        
        System.out.println(min);
    }
}