/*Question for print pattern
 *   *** ***
 *   **   **
 *   *     *
 *   **   **
 *   *** ***
 */

package QuestionAndAnswer;
import java.util.Scanner;
public class pattern6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int mid=num/2;
        int str=mid+1;
        int sp=1;
        for(int i=1;i<=num;i++){
            //System.out.println(""+str +" "+ " " +sp + " "+str);
            for(int j=1;j<=str;j++){
                System.out.print("*");
            }
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*");
            }
            if(i<=mid){
                str--;
                sp=sp+2;
            }
            else{
                sp=sp-2;
            str++;
            }
            System.out.println();
        }
    }
    
}
