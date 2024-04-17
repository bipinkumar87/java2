/*
 * Question :-
 * rotate a number from kth position
 * ie number =12343
 * position 3
 * output=34312
 * 
 */

package QuestionAndAnswer;
import java.util.Scanner;
public class rotatenumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int rem=num;
        System.out.println("Enter valur of k");
        int k=sc.nextInt();
        int count=0;
        int div=1;
        int div1=1;
        while(num !=0){
            num=num/10;
            count++;
        }
        k=k%count;
        if(k<0){
            k=count+k;
        }
        int mid=count-k;
        //System.out.println(mid);
        for(int i=0;i<k;i++){

            div=div*10;
        }
        for(int i=0;i<mid;i++){
            div1=div1*10;
        }
        //System.out.println(div1);
        int q=rem/div;
         int re=rem%div;
        int ans=re*div1+q;
        System.out.println(ans);
    }
    
}
