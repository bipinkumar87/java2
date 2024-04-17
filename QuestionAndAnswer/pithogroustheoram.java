/*
 * 
 */

package QuestionAndAnswer;
import java.util.Scanner;



import java.util.*;
import java.lang.Math;
public class pithogroustheoram {
 public static void main(String args[]){
    Scanner cs=new Scanner(System.in);
    System.out.println("enter three number");
    int a=cs.nextInt();
    int b=cs.nextInt();
    int c=cs.nextInt();
    if(a>=b && b>=c || b>=a && a>=c || c>=a && c>=b){
        int a1=a*a;
        int b1=b*b;
        int c1=c*c;
        if(a1==b1+c1){
            System.out.println("follow paitha ");
        }
        else if(b1==a1+c1){
            System.out.println("fallow pathagouras");
        }
        else if(c1==a1+b1){
            System.out.println("fallow ");
        }
        else{
            System.out.println("not follow");
        }
        
    }
 }   
}
