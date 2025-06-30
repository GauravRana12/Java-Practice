public class SumAndAverage2D {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        int Sum=sum(arr);
        int Average=avg(Sum,arr);
        System.out.println("Sum of the elements in 2D Array is: "+ Sum);
        System.out.println("Average of the elements in 2D Array is: "+Average);
    }

    public static int sum(int[][] arr) {
        int sum=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static int avg(int sum, int[][] arr){
        int average=0;
        int n=arr.length+arr[0].length;
        average=sum/n;
        return average;
    }
}
