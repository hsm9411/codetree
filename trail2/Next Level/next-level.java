import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int num = sc.nextInt();

        Info info1 = new Info();
        Info info2 = new Info(str,num);

        info1.str = new String("codetree");
        info1.num = 10;

        System.out.println(info1);
        System.out.println(info2);

    }
}

class Info{
    String str;
    int num;

    public Info(){
        this.str = "";
        this.num = 0;
    }

    public Info(String str, int num){
        this.str = str;
        this.num = num;
    }

    public String toString(){
        return "user "+ this.str + " lv "+this.num;
    }

}