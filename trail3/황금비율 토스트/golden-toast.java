import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 식빵의 개수 n과 명령어의 개수 m 입력
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // 2. 초기 식빵 문자열 입력
        String str = sc.next();
        
        // 커서를 기준으로 왼쪽과 오른쪽을 나눌 스택
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        
        // 초기에는 가리키는 위치(커서)가 맨 뒤에 있으므로 모든 빵을 왼쪽 스택에 넣음
        for (int i = 0; i < n; i++) {
            leftStack.push(str.charAt(i));
        }
        
        // 3. m개의 명령어 처리
        for (int i = 0; i < m; i++) {
            String command = sc.next(); // 명령어(L, R, D, P) 읽기
            
            if (command.equals("L")) {
                // 커서를 왼쪽으로 이동
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (command.equals("R")) {
                // 커서를 오른쪽으로 이동
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
            } else if (command.equals("D")) {
                // 커서 바로 뒤(오른쪽)에 있는 빵 제거
                if (!rightStack.isEmpty()) {
                    rightStack.pop();
                }
            } else if (command.equals("P")) {
                // 커서 위치에 새로운 빵(문자) 추가
                // P 명령어 뒤에 띄어쓰기 되어있는 문자 읽기 (예: "P s"에서 's'를 읽음)
                String pStr = sc.next(); 
                leftStack.push(pStr.charAt(0));
            }
        }
        
        // 4. 출력 준비
        // 정방향으로 출력하기 위해 왼쪽 스택에 남은 문자들을 전부 오른쪽 스택으로 넘김
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        
        // 오른쪽 스택에서 하나씩 꺼내어 결과 문자열 만들기
        StringBuilder sb = new StringBuilder();
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        
        // 결과 출력
        System.out.println(sb.toString());
        
        sc.close();
    }
}