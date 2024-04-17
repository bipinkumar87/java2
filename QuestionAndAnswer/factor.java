/*
 * qurstion :-
 * find factor
 * 16=2*2*2*2
 */
package QuestionAndAnswer;
import java.util.Scanner;

public class factor {
  public static void main(String args[]){
    Scanner sv =new Scanner(System.in);
    System.out.println("enter a num");
    int num=sv.nextInt();
    int i=2;
    while(i <=num){
        while(num !=1){
            if(num%i !=0){
                i++;
            }
            else{
                num=num/i;
                System.out.println(i);
            }
        }
    }
    
  }  
}
