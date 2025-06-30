public class DeleteElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,4,8,4};
        int del=4;
        int howManyEle=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==del){
                arr[i]=Integer.MAX_VALUE;
                howManyEle++;
            }
        }
        int n=arr.length-howManyEle;
        int[] ans=new int[n];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=Integer.MAX_VALUE){
                ans[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+", ");
        }
    }
}
