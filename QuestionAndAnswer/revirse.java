/*
 * question :- print reverse number
 * input 123
 * output 321
 * 
 */


package QuestionAndAnswer;
import java.util.Scanner;

public class revirse {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter an number");
    int num =sc.nextInt();
    while(num !=0){
        int j=num%10;
        System.out.println(j);
        num=num/10;
    }

 }   
}
