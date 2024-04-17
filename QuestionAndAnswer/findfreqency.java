/*
 * find frequency of the number
 * 
 */



package QuestionAndAnswer;
import java.util.Scanner;
public class findfreqency {

    public static int freq(int num,int digi){
        int count=0;
        
        while(num>0){
            
            int ans=num%10;
            num=num/10;
            if(ans==digi){
                count++;
            }
        }
        return count;
    }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int fnum=sc.nextInt();
    System.out.println("enter sec number");
    int fsec=sc.nextInt();
    int ans=freq(fnum, fsec);
    System.out.println(ans);


   } 
}
