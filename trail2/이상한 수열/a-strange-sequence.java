import java.util.Scanner;
public class Main {

    static int f(int n){
        if(n==1 || n==2){
            return n;
        }
        return f(n/3) + f(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(f(n));
    }
}