import java.util.*;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of elements in the array one by one: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans1=sum(arr,n);
        int ans2=average(ans1,n);
        System.out.println("The sum of all elements in the array is: "+ans1);
        System.out.println("The average of all elements in the array is: "+ans2);
    }
    public static int sum(int[] arr, int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int average(int sum, int n){
        return sum/n;
    }
}
