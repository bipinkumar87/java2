import java.util.Scanner;
public class pellidrom {
    public static boolean ispellidrom(String as){
        int i=0;
        int j=as.length()-1;
        while(i<=j){
            char ch1=as.charAt(i);
            char ch2=as.charAt(j);
            if(ch1 != ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }


        return true;
    }

    public static void sub(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String s=str.substring(i,j);
                //System.out.println(s);
                if(ispellidrom(s)==true){
                    System.out.println(s);
                }
            }
            
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String ss=sc.nextLine();
        //System.out.println(ss);
        sub(ss);

    }
}
