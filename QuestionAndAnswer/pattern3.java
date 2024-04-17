/*
 * question :-
 * print pattern
         *
        **
       ***
      ****
     ***** 
 * 
 */


package QuestionAndAnswer;
import java.util.Scanner;
public class pattern3 {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a numner");
    int num=sc.nextInt();
    int spc=num-1;
    int str=1;
    for(int i=1;i<=num;i++){
        
        for(int j=1;j<=spc;j++){
            System.out.print(" ");
           
        }
        for(int j=1;j<=str;j++){
            System.out.print("*");
            
        }
         spc--;
         str++;
        System.out.println();
    }
    

  } 
}
