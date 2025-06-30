import java.util.*;
public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr={1,4,2,6,90,8,11,2,5,18,45,9,-24};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            else if(max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("The maximum number in the array is "+ max);
        System.out.println("The minimum number in the array is "+ min);
    }
}
