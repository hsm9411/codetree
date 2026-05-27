import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        String sortedStr = new String(ch);

        System.out.println(sortedStr);

    }
}