import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
            
            if(i%2==0){
                Arrays.sort(nums,0,i+1);
                System.out.print(nums[i/2]+ " ");
            }
        }

    }
}