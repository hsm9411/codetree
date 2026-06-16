import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x=new int[n];
        int[] y=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        int w=0;
        int h=0;
        int area=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    boolean hasx = x[i]==x[j] || x[i]==x[k] || x[j]==x[k];
                    boolean hasy = y[i]==y[j] || y[i]==y[k] || y[j]==y[k];
                    if(!hasx || !hasy) continue;
                    int minx=Math.min(x[i],Math.min(x[j],x[k]));
                    int maxx=Math.max(x[i],Math.max(x[j],x[k]));
                    int miny=Math.min(y[i],Math.min(y[j],y[k]));
                    int maxy=Math.max(y[i],Math.max(y[j],y[k]));
                    w=maxx-minx;
                    h=maxy-miny;
                    area=Math.max(area,w*h);
                }
            }
        }
        System.out.println(area);
    }
}