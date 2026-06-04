import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int total = 0;
        int min = s;

        for(int i=0; i<n; i++){
            total += arr[i];
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                min = Math.min(min,Math.abs(s - total + arr[i] + arr[j]));
            }
        }

        System.out.println(min);

    }
}