import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();

        for(int i=1;i<=num2;i++){
            if(num*i%num2==0){
                System.out.print(num*i);
                break;
            }
        }
//        if(num>num2){
//            main=num;
//        }
//        else {
//            main=num2;
//        }
//        while(i==0){
//            if(main%num==0 && main%num2==0){
//                i=main;
//            }
//            else{
//                main++;
//            }
//        }
//        System.out.println(i);
    }
}
