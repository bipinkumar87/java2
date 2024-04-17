/*
 * print pattern
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 
 */

package QuestionAndAnswer;
import java.util.Scanner;
public class patt13 {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                int b=i-j;
                int n=i-b;
                b=n;
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
    
}
