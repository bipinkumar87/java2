/*
 * Qurstion num 6:
 * print all digit
 * 12345
 * output
 * 1
 * 2
 * 3
 * 4
 * 5
 */

package QuestionAndAnswer;
import java.util.Scanner;
public class printDisit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int count=0;
        int num=sc.nextInt();
        int div=num;
        int dis=1;
        while(num !=0){
            num=num/10;
            count++;
        }
        for(int i=1;i<count;i++){
            
            dis=dis*10;
            
        }
        System.out.println(dis);
        while(dis !=0){
         int q=div/dis;
         System.out.println(q);
         div=div%dis;
         dis=dis/10;
         }
    }
    
}
