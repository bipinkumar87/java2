import java.util.Scanner;
public class sumof3array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of first element");
        int size1=sc.nextInt();
        System.out.println("enter element of first array element");
        int arr1[]=new int[size1];
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();

        }
        System.out.println("enter size of second array");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        System.out.println("enter second element array");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("enter size of third array");
        int size3=sc.nextInt();
        System.out.println("enter element of third array");
        int arr3[]=new int[size3];
        for(int i=0;i<size3;i++){
            arr3[i]=sc.nextInt();
        }
        //int maxi=Math.max(size2, size3);
        //int finalSize=Math.max(maxi, size1);
        //System.out.println(finalSize);
        int max=(size1>size2)?size1:size2;
        int finalSize=(max>size3)?max:size3;
        int c=0;
        int i=size1-1;
        int j=size2-1;
        int k=size3-1;
        int l=finalSize;
        int sum[]=new int[finalSize+1];
        while(l>=0){
            int d=c;
            if(i>=0){
                d=d+arr1[i];
            }
            if(j>=0){
                d=d+arr2[j];
            }
            if(k>=0){
                d=d+arr3[k];
            }
            c=d/10;
            d=d%10;
            sum[l]=d;
            i--;
            j--;
            k--;
            l--;
        }
        if(c != 0){
            System.out.print(c);
        }
        else{
       for(int n=1;n<sum.length;n++) {
        System.out.println(sum[n]);
       }
    }
    }
}
