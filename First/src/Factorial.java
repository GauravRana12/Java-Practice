import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num=sc.nextInt();
        int factorial=1;
        for(int i=num;i>=1;i--){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
