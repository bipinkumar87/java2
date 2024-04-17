/*
 * Question 4:-
 * print fibbo series
 * ie 0,1,1,2,3,5,8,13
 * 0+1=1
 * 1+1=2
 * 2+1=3
 * 3+2=5
 * 5+3=8
 * 8+5=13
 * 
 * 
 */
package QuestionAndAnswer;
import java.util.Scanner;
public class PrintfibboNumber {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int firstnum=0;
    int seconum=1;
    System.out.println("how many number you want to emter");
    int num=sc.nextInt();
    for(int i=0;i<num;i++){
        System.out.println(firstnum);
        int c=firstnum+seconum;
        seconum=firstnum;
        firstnum=c;
    }
    }
    
}
