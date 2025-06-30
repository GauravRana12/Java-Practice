public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] rev=new int[arr.length];
        int k=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[k]=arr[i];
            k++;
        }
        for(int i=0;i<rev.length;i++)
        {
            System.out.print(rev[i]+" ");
        }
    }
}
