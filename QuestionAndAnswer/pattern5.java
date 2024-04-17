/*Question of pattern
 *     *
 *    ***
 *   *****
 *    ***
 *     *
 * 
 * 
 */



package QuestionAndAnswer;
import java.util.Scanner;
public class pattern5 {
 public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int num =sc.nextInt();
    
    int mid=num/2;
    int str=1;
    int spc=mid+1;
    for(int i=1;i<=num;i++){
        
        for(int j=1;j<=spc;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=str;j++){
        System.out.print("*");

        }
        if(i>mid){
            str=str-2;
            spc=spc+1;
        }
        else{
            str=str+2;
            spc=spc-1;
        }
        System.out.println();

    }
 }  
}
