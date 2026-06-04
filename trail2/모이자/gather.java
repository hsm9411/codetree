import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int min = 100000;

        for(int i=0; i<a.length; i++){
            int temp = 0;
            for(int j=0; j<a.length; j++){
                temp = temp + Math.abs(i-j) * a[j];
            }
            min = Math.min(temp, min);
        }

        System.out.println(min);
    }
}