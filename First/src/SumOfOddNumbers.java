import java.util.*;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum of the odd numbers between 1 and "+num+" is "+sum);
    }
}
