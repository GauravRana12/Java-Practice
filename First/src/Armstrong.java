import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        armstrong(nums);
    }
    public static void armstrong(int nums){
        int temp=nums;
        int temp3=nums;
        int n=0;
        while(temp>0) {
            n++;
            temp /= 10;
        }
        int sum=0;
        for(int i=0;i<n;i++) {
            int temp2=temp3%10;
            temp3/=10;
            sum+=Math.pow(temp2,n);
        }
         if(sum==nums){
             System.out.println(true);
         }
         else{
             System.out.println(false);
         }
    }
}
