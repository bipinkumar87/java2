package QuestionAndAnswer;
import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int mid=num/2;
        int sp=mid;
        int digi=1;
        int a=0;
        for(int i=1;i<=num;i++){
        
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=digi;j++){
                int val=a;
                System.out.print(val+j);
                if(j<=digi/2){
                    val++;
                }else{
                    val--;
                }
            }
            a++;
            
            if(i>mid){
                sp++;
                digi=digi-2;
            }
            else{
                sp--;
                digi=digi+2;
            }
            System.out.println();
        }
    }
  

}
