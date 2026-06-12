import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int total=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                for(int k=0;k<5;k++){
                    for(int l=k+1;l<5;l++){
                        if(!(k==i || k==j || l==i || l==j)){
                            sum1=arr[i]+arr[j];
                            sum2=arr[k]+arr[l];
                            sum3=total-sum1-sum2;
                             if(sum1==sum2 || sum2==sum3 || sum3==sum1) continue;
                            min=Math.min(min,Math.abs(Math.max(sum1,Math.max(sum2,sum3))-Math.min(sum1,Math.min(sum2,sum3))));
                        }
                    }
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            System.out.println(-1);
            return;
        }
        System.out.println(min);

    }
}