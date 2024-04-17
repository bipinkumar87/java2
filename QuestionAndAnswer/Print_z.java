/*
 * 
 * Question:-(1)----
 * print "Z"
 */



 
package QuestionAndAnswer;
import java.util.Scanner;
public class Print_z {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                if((i+j)==number+1 ||i==1||i==number){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
