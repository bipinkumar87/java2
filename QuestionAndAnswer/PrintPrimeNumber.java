/*
 * Question :- (2)--
 * there are present n number find number are prime or not.
 * ie 1,3,5,7,11.....
 * 
 * 
 * 
 */

package QuestionAndAnswer;
import java.util.Scanner;
public class PrintPrimeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number you want to check");
        int siz=sc.nextInt();
        
        for( int i=0;i<siz;i++){
            int j=sc.nextInt();
            int cou=0;
        for(int k=2;k*k<=j;k++){
            
            if(j%k==0){
                cou++;
                break;
            }
        }
        if(cou==1){
            System.out.println("not prime");
            
        }
        else{
            System.out.println(" prime");
        }
        }
        
        
    }
}
