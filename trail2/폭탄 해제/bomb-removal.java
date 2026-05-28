import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String code = sc.next();
        char color = sc.next().charAt(0);
        int sec = sc.nextInt();

        Info info = new Info(code,color,sec);

        System.out.println(info);
    }
}

class Info{
    String code;
    char color;
    int sec;

    public Info(){
        this.code = "default";
        this.color = 'X';
        this.sec = 0;
    }

    public Info(String code, char color, int sec){
        this.code = code;
        this.color = color;
        this.sec = sec;
    }

    public String toString(){
        return "code : " + code + "\ncolor : " +color+"\nsecond : "+sec;
    }
}