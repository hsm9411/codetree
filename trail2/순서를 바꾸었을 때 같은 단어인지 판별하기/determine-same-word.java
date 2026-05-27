import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        String ss1 = new String(chars1);
        String ss2 = new String(chars2);

        String ans = new String();

        if(ss1.equals(ss2)){
            ans = "Yes";
        }else{
            ans = "No";
        }

        System.out.println(ans);
    }
}