/*
 * 0
 * 1 1
 * 2  3  5
 */


package QuestionAndAnswer;
import java.util.Scanner;
public class pattern12 {
 public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num");
    int num=sc.nextInt();
    int a=1;
    int b=0;
    for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
            int c=a+b;
            System.out.print(b +" ");
            b=a;
            a=c;
        }
        System.out.println();
    }
 }   
}
