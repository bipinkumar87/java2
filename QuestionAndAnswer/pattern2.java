/*
Question :-
print pattern
   ****
   ***
   **
   *
 */


package QuestionAndAnswer;

import java.util.Scanner;

public class pattern2 {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        for(int i=num;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
