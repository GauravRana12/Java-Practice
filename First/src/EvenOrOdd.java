import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num%2==0 && num!=0){
            System.out.print(num+" is a even number");
        }
        else{
            System.out.print(num+" is a odd number");
        }
    }
}
