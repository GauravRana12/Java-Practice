public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr={2,1,0,1,2};
        int[] rev=new int[arr.length];
        boolean flag=true;
        int i=0;
        int j=arr.length-1;
        while(i<arr.length){
            rev[i]=arr[j];
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]!=rev[k]){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
