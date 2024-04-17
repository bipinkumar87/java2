/*
 * Question no 5:-
 * Count disit
 * ie 123213
 * there are present 6 digite.
 * 
 * 
 * 
 * 
 */

package QuestionAndAnswer;
import java.util.Scanner;
public class CountDisit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("ent num");
    
        int num=sc.nextInt();
        int count=0;
    
        while(num!=0){
             num = num/10;
            count++;
        }
        System.out.println("num"+
        count);
    }
    
}
