package StsckQuestion;

import java.util.Stack;

public class firstStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st);
        System.out.println(st+"size are"+st.size()+"peek value are");

        st.add(10);
        System.out.println(st+"size are"+st.size()+"peek value are"+st.peek());
        st.add(209);
        System.out.println(st+"size are"+st.size()+"peek value are"+st.peek());
        st.add( 30);
        System.out.println(st+"size are"+st.size()+"peek value are"+st.peek());
        


    }
}
