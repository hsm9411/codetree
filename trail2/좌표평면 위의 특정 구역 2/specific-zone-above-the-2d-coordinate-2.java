import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int minx = 1;
            int maxx = 40000;
            int miny = 1;
            int maxy = 40000;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                minx= Math.max(arr[j][0], minx);
                maxx= Math.min(arr[j][0], maxx);
                miny= Math.max(arr[j][1], miny);
                maxy= Math.min(arr[j][1], maxy);
            }
            min = Math.min((maxx-minx)*(maxy-miny),min);
        }
        System.out.println(min);
    }
}