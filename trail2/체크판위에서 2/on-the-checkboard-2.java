import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] ch = new char[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ch[i][j] = sc.next().charAt(0);
            }
        }

        int answer = 0;

        for(int i=1; i<r-1; i++){
            for(int j=1; j<c-1; j++){
                
                for(int k=i+1; k<r-1; k++){
                    for(int l= j+1; l<c-1; l++){
                        if(ch[i][j]!=ch[0][0] && ch[k][l]!=ch[i][j] && ch[k][l]!= ch[r-1][c-1]){
                            answer++;
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }
}