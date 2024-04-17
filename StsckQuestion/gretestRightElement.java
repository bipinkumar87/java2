package StsckQuestion;
import java.util.Scanner;
import java.util.Stack;
public class gretestRightElement {
    public static void main(String[] args) {
        int arr[]={3,5,2,6};
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            st.push(arr[i]);
           if(st.peek()<arr[i]){
            st.pop();
           }
           else if(st.peek()>arr[i]){
            System.out.println(arr[i]+"--"+st.peek());
           }
           else{
            System.out.println("-1") ;
           }
        }

    }
    
}
