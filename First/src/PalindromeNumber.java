import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        boolean ans=isPalindrome(nums);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int nums){
         int temp=0;
         int conv=nums;
         while(conv>0){
             int digit=conv%10;
             conv/=10;
             temp=temp*10+digit;
         }
         if(nums==temp){
             return true;
         }
        return false;
    }
}
