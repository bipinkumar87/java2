

import java.util.Scanner;

public class sumofarray {
    public static int sum1(int arr1[],int arr2[]){
        
        int size1=arr1.length-1;
        int size2=arr2.length-1;
         int carr=0;

        int finalSize=Math.max(size1, size2);
       int sum[]=new int[finalSize+1];
       while(finalSize>=0){
        int disi=carr;
        if(size1>=0){
            disi=disi+arr1[size1];
        }
        if(size2>=0){
            disi=disi+arr2[size2];
        }
        carr=disi/10;
        disi=disi%10;
        sum[finalSize]=disi;
        size1--;
        size2--;
        finalSize--;

       }
       if(carr !=0){
        System.out.print(carr);
       }
       for (int i : sum) {
        System.out.print(i);
       }
       return 1;
    }
     
        


        
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of first array");
        int size1=sc.nextInt();
        System.out.println("enter size of second array");
        int size2=sc.nextInt();
        System.out.println("enter number of first array");
        int arr1[]=new int[size1];
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[size2];
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        sum1(arr1, arr2);
        

    }
}
