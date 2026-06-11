import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int sum1=0;
        int sum2=0;
        int total=0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt(); // <--- 이 부분 추가
            total += arr[i];
        }

        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                for(int k=j+1;k<6;k++){
                    
                    sum1 = arr[i]+arr[j]+arr[k];
                    sum2 = total - sum1;
                    min = Math.min(min, Math.abs(sum1-sum2));
                }
            }
        }
        System.out.println(min);
    }
}