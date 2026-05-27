import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        // 입력이 끝날 때까지 단어를 하나씩 읽어들임
        while (sc.hasNext()) {
            String word = sc.next();
            
            // 만약 첫 줄에 단어의 개수(n)가 숫자로 들어오면 리스트에 넣지 않고 건너뜀
            if (word.matches("^[0-9]+$")) {
                continue;
            }
            
            // 소문자 알파벳으로 이루어진 단어를 리스트에 추가
            words.add(word);
        }

        // 리스트에 저장된 단어들을 사전순(오름차순)으로 정렬
        Collections.sort(words);

        // 정렬된 단어들을 한 줄에 하나씩 출력
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}