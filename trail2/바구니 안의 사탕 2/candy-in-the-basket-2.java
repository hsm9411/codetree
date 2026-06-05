import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt(); // K 값 (반경)
        
        // [수정 3] 문제의 바구니 위치(좌표) 최댓값 조건에 따라 배열 크기를 넉넉하게 잡아주세요.
        int MAX_POS = 100; 
        int[] candies = new int[MAX_POS + 1];
        int[] candiesidx = new int[n];
        
        int maxIdx = 0; // 입력된 좌표 중 가장 큰 값 추적
        
        for(int i = 0; i < n; i++){
            int cnum = sc.nextInt(); // 사탕 개수
            int cidx = sc.nextInt(); // 바구니 위치(좌표)
            if(candies[cidx]!=0) {
                candies[cidx] += cnum;
                continue;
            }
            candies[cidx] = cnum;
            candiesidx[i] = cidx;
            
            maxIdx = Math.max(maxIdx, cidx);
        }
        
        // 탐색의 시작점을 사탕이 있는 위치로 잡은 것은 매우 좋은 접근입니다!
        Arrays.sort(candiesidx);
        int max = 0;
        
        for(int index : candiesidx){
            int temp = 0;
            // [수정 2] 시작점이 index일 때, 구간의 끝은 index + 2*c (반경 c의 2배 길이)
            for(int i = index; i <= index + 2 * c; i++){
                
                // [수정 1] 바구니 개수 n이 아닌, 가장 큰 좌표(maxIdx)나 배열 범위를 넘어가면 중단
                if(i > maxIdx || i >= candies.length) break;
                
                temp += candies[i];
            }
            max = Math.max(max, temp);
        }
        System.out.println(max);
    }
}