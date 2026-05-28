import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int num;
        Info info = new Info();

        info.ch = sc.next().charAt(0);
        info.num = sc.nextInt();

        for(int i=0; i<4; i++){
            ch = sc.next().charAt(0);
            num = sc.nextInt();
            if(info.num > num){
                info.ch = ch;
                info.num = num;
            }    
        }

        System.out.println(info);
    }
}

class Info{
    char ch;
    int num;

    public Info(){
        this.ch = 'X';
        this.num = 0;
    }
    
    public Info(char ch, int num){
        this.ch = ch;
        this.num = num;
    }

    public String toString(){
        return this.ch + " " + this.num;
    }

}