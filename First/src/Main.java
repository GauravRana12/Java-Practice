//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int stars=5;
       for(int i=1;i<=stars;i++){
           for(int m=i;m<stars;m++){
               System.out.print(" ");
           }
           for(int j=i;j>=1;j--){
               System.out.print('*');
           }
           for(int j=1;j<i;j++){
               System.out.print('*');
           }
           System.out.println();
       }
    }
}