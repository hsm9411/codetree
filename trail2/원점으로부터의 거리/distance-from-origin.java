import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point> {
    int x;
    int y;
    int n;

    public Point(int x, int y, int n){
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String toString(){
        return ""+n;
    }

    public int compareTo(Point point){
        if(Math.abs(x)+Math.abs(y) - Math.abs(point.x) - Math.abs(point.y)==0)
            return n-point.n;
        return Math.abs(x)+Math.abs(y) - Math.abs(point.x) - Math.abs(point.y);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        Point[] p = new Point[n];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            p[i] = new Point(points[i][0],points[i][1],i+1);
        }
        
        Arrays.sort(p);
         for (int i = 0; i < n; i++) {
            System.out.println(p[i]);
        }
    }
}