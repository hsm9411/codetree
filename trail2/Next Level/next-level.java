import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int num = sc.nextInt();

        Info info1 = new Info();
        Info info2 = new Info(str,num);

        System.out.println(info1);
        System.out.println(info2);

    }
}

class Info{
    String str = new String("codetree");
    int num = 10;

    public Info(){    }

    public Info(String str, int num){
        this.str = str;
        this.num = num;
    }

    public String toString(){
        return "user "+ str + " lv "+num;
    }

}