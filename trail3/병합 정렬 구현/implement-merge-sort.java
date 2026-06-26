import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 메모리 절약을 위해 임시 배열을 한 번만 생성해서 넘겨줍니다.
        int[] marr = new int[n]; 
        
        // 에러 수정: n 대신 n - 1을 전달합니다.
        ms(arr, marr, 0, n - 1);
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void ms(int[] arr, int[] marr, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            ms(arr, marr, low, mid);
            ms(arr, marr, mid + 1, high);
            merge(arr, marr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int[] marr, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int k = low;
        
        // 정렬하며 임시 배열(marr)에 저장
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                marr[k] = arr[i];
                k++;
                i++;
            } else {
                marr[k] = arr[j];
                k++;
                j++;
            }
        }
        
        // 왼쪽 부분 배열이 남은 경우
        while(i <= mid){
            marr[k] = arr[i];
            k++;
            i++;
        }
        
        // 오른쪽 부분 배열이 남은 경우
        while(j <= high){
            marr[k] = arr[j];
            k++;
            j++;
        }
        
        // 정렬된 임시 배열의 내용을 원본 배열(arr)에 복사
        for(int l = low; l <= high; l++){
            arr[l] = marr[l];
        }
    }
}