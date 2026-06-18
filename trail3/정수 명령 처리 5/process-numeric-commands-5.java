import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String command = sc.next();
            if(command.equals("push_back")) {
                list.add(sc.nextInt());
                continue;
            };
            if(command.equals("get")) {
                System.out.println(list.get(sc.nextInt()-1));
                continue;
            };
            if(command.equals("size")) {
                System.out.println(list.size());
                continue;
            };
            if(command.equals("pop_back")) {
                list.remove(list.size()-1);
                continue;
            };
        }
    }
}