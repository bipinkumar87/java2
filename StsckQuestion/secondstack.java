package StsckQuestion;

import java.util.Stack;

public class secondstack {
    Stack<Integer> st;
    public  void pushElement(){
        st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(25);
        System.out.println(st);


    }
    public void popElement(){
       System.out.println( st.pop());

    }
    public static void main(String[] args) {
        secondstack sd = new secondstack();
        sd.st=new Stack<>();
        sd.pushElement();
        sd.popElement();
        sd.pushElement();
        sd.popElement();
        sd.pushElement();
        
    }
}
