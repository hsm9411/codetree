import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        
        sCode = sc.next();
        mPoint = sc.next().toCharArray()[0];
        time = sc.nextInt();

        Info info = new Info(sCode,mPoint,time);
        System.out.print(info);
    }
}

class Info{
    String sCode;
    char mPoint;
    int time;

    public Info(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }

    public String toString(){

        return "secret code : " + sCode + "\nmeeting point : " + mPoint + "\ntime : " + time;
    }

}