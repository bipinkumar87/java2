/*

Question:-3---
 * print prime number from starting number to end of number.
 * ie find prime number between 1 to 10.
 * find prime number between 100 to 888.
 * 
 * 
 */
package QuestionAndAnswer;
import java.util.Scanner;
public class printprimarynumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter initial number");
        int inital=sc.nextInt();
        System.out.println("enter final num");
        int fnum=sc.nextInt();
        for(int i=inital;i<=fnum;i++){
            int count=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    break;
                }

            
            }
            if(count==0){
                System.out.println(i+"prime");
            }
            else{
                System.out.println(i+"not prime");
            }

        }
    }
}
