import java.util.*;
public class Fibonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int[] arr=new int[nums];
        arr[0]=0;
        arr[1]=1;
        if(nums>=2){
            for(int i=0;i<nums;i++){
                if(i>1){
                    arr[i]=arr[i-1]+arr[i-2];
                    System.out.println(arr[i]);
                }
                else {
                    System.out.println(arr[i]);
                }
            }
        }
        else{
            for(int i=0;i<nums;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
