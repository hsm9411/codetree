import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point> {
    int num;
    int index;

    public Point(int num, int index){
        this.num = num;
        this.index = index;
    }

    public int compareTo(Point point){
        return num - point.num;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answer = new int[n+1];
        Point[] points = new Point[n];

        for(int i=0; i<n; i++){
            points[i] = new Point(sc.nextInt(), i+1);
        }

        Arrays.sort(points);

        for(int i=0; i<n; i++){
            answer[points[i].index] = i+1;
        }

        for(int i = 1; i <= n; i++){
            System.out.print(answer[i] + " ");
        }
    }
}