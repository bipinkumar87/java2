package array;

public class margetwoarray {
    public static void main(String ar[]){
        int sr[]={1,3,5};
        int sa[]={2,4,6};
        int i=sr.length;
        int j=sa.length;
        int max=Math.max(i, j);
        int mer[]=new int[max+1];
        int k=0;
        //while(max>=0)
        //{
            for(int i1=0;i1<i;i1++){
                for(int j1=i1+1;j1<j;j1++){
                    if(sr[i]<sa[j]){
                        mer[k]=sr[i];
                        k++;
                    }
                    else{
                        //System.out.println(sa[j]);
                        mer[k]=sa[j];
                    }
                    k++;
                }
            }
            for(int val:mer){
                System.out.println(val);
            }

        
    }
}
