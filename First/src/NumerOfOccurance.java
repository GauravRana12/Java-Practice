import java.util.*;
public class NumerOfOccurance {
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,5,3,4,5,3,4,5,8};
        int n=5;
        int occ=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                occ++;
            }
        }
        System.out.println(occ);
    }
}
