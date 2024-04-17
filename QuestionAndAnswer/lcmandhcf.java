/*
 * Question :-
 * find lcm and hcf
 * ie find lcm and hcf of 8 and 16
 * 8=2*2*2
 * 16=2*2*2*2
 * lcm=16 and hcf=8
 * 
 */


package QuestionAndAnswer;
import java.util.Scanner;
public class lcmandhcf {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int fnum=sc.nextInt();
        System.out.println("enter second number");
        int snum=sc.nextInt();
        
    
            
            while(snum%fnum !=0){
             
              int rem=  snum%fnum;
              snum=fnum;
              fnum=rem;
              
              
            }
            
            
            System.out.println(fnum);
        
    }
    
}
