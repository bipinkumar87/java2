package StsckQuestion;
import java.util.Stack;
import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<ss.length();i++){
            char ch=ss.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println(true);
                    return;

                }
                else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }

            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);

        
    }
    
}
