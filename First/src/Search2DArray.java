public class Search2DArray {
    public static void main(String[] args) {
      int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
      int find=11;
      boolean flag=false;
        for(int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[0].length;j++){
                if(find==arr[i][j]){
                    flag=true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}