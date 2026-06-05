import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[10001];
        int[] idxArr = new int[n];

        for(int i=0; i<n; i++){
            int index = sc.nextInt();
            idxArr[i]=index;
            char ch = sc.next().charAt(0);
            if(ch=='G') arr[index]=1;
            else arr[index]=2;
        }
        Arrays.sort(idxArr);
        int max = 0;
        for(int idx : idxArr){
            int temp = 0;
            for(int i=0; i<=k; i++){
                if (idx + i <= 10000) {
                    temp += arr[idx + i];
                }
            }
            max = Math.max(max, temp);
        }

        System.out.println(max);
    }
}