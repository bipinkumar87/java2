/*question :-

 * bulb toggle
 * there preent n number of bulb
 */

package QuestionAndAnswer;
import java.util.Scanner;
public class togglebulb {
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter bulbes");
        int bulb=sc.nextInt();
        System.out.println("enter togell position");
        int togg=sc.nextInt();
        for(int i=1;i<=bulb;i++){
            if(i%togg==0){
                System.out.print(i + "true , ");
            }
            else{
                System.out.print(i+"false , ");
            }
        }
    }
    
}
