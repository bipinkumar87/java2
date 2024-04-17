package StringPractice;
import java.util.Scanner;
public class FirstString {
    public static void main(String[] args) {
        String s="hello"; 
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        //System.out.println(s1.length());
        //System.out.println(s2); 
        //System.out.println(s1.charAt(2));
        
           int i=0;
           int j=0;
           int p=s1.length();
           int q=s2.length();
           
           while(i<p && j<q){

                char c=s1.charAt(i);
                System.out.println(c);
                char c1=s2.charAt(j);
                System.out.println(c1);
                 i++;
                 j++;
           }
           while(i<p){
            char c2=s1.charAt(i);
            System.out.println(c2);
            i++;
           }
           while(j<q){
            char c3=s2.charAt(j);
            System.out.println(c3);
            j++;
           }
          
            
        
    }
}
