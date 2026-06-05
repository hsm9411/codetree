import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                int idx = 0;
                int[] part = new int[j-i+1];
                for(int k=i; k<=j; k++){
                    part[idx]=arr[k]*(j-i+1);
                    sum += arr[k];
                    idx++;
                }
                for(int l=0; l<idx; l++){
                    if(part[l]==sum) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}