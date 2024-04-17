/*
 * Question :-
 * print pattern
           *****
            ****
             ***
              **
               *
 * 
 */

package QuestionAndAnswer;
import java.util.Scanner;
public class pattern4 {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int num=sc.nextInt();
    int str=num;
    int sp=0;
    for(int i=1;i<=num;i++){
         for(int j=1;j<=sp;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=str;j++){
            System.out.print("*");
        }
       
        str--;
        sp++
        ;
        System.out.println();
    }
  }  
}
