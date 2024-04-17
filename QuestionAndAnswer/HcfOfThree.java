/*
 * Question :=
 * hcf of three number
 * ie n1=10
 * n2=20
 * n3=30
 * output are 10
 * 
 */



package QuestionAndAnswer;
import java.util.Scanner;
public class HcfOfThree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        while(n1%n2 !=0 && n2%n3 !=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
            int rem1=n2%n3;
            n2=n3;
            n3=rem1;
            

        }
        System.out.print(n3);
    }
    
}
