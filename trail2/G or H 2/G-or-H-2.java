import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] charr = new char[101];
        int[] chidx = new int[n];
        int gcnt = 0;
        int hcnt = 0;

        for(int i=0; i<n; i++){
            int index = sc.nextInt();
            char ch = sc.next().charAt(0);
            charr[index] = ch;
            chidx[i] = index;
        }
        Arrays.sort(chidx);
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=i;j<n;j++){
                gcnt=0;
                hcnt=0;
                for(int k=i; k<=j; k++){
                    if(charr[chidx[k]]=='G') gcnt++;
                    else if(charr[chidx[k]]=='H') hcnt++;
                }
                if(gcnt==0 || hcnt==0 || (gcnt==hcnt)){
                    max = Math.max(max,chidx[j]-chidx[i]);
                }
            }
        }
        System.out.println(max);
    }
}