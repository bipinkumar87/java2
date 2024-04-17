package StringPractice;

public class secondString {
    public static void main(String[] args) {
        String ss="bipinprajapati";
        for(int i=0;i<ss.length();i++){
            for(int j=i+1;j<=ss.length();j++){
               String ss1=ss.substring(i, j);
               if(ss1.length()==1){
                System.out.println(ss1 + "  are pelidrom");

               }
               else{
                int k=0;
                int m=ss1.length()-1;
                while(m>=k){
                    char ch1=ss1.charAt(k);
                    char ch2=ss1.charAt(m);
                    if(ch1!=ch2){

                    }
                    else{
                        k++;
                        m--;
                        System.out.println( ss1 +"  is peli");
                    
                    }
                    

                }

               }
            }
        }
    }
    
}
