import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        bs(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        
    }

    public static int[] bs(int[] arr){
        int len = arr.length;

        for(int i = 0 ;i < len - 1;i++){
            for(int j = 0; j < len - 1 - i;j++){
                if (arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }     
            }
        }
        return arr;
    }
            
}