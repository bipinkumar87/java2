package array;

import java.util.Scanner;

public class sumoftwoarray{
      //int c=0;
     //int d=c;
    //static int sum1[];
    public static void displayf(int c,int sum1[]){
        sumoftwoarray a=new sumoftwoarray();
        if(c!=0){
            System.out.print(c);
        }
        for(int val:sum1){
            System.out.print(val);
        }

    }
    public static int[] sum(int arr1[],int arr2[]){
        sumoftwoarray a=new sumoftwoarray();
        int c=0;
        int d=c;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int max=Math.max(i, j);
        int k=max;
        int []sum1=new int[k+1];
        
        while(k>=0){
            if(i>=0){
                d=d+arr1[i];
            }
            if(j>=0){
                d=d+arr2[j];
            }
            c=d/10;
            d=d%10;
            sum1[k]=d;
            
            i--;
            j--;
            k--;
            
            
        }
        





        return sum1;
        
        
    }
     public static void main(String[] args) {
      /*   int srr[]={9,2,3,4};
        int sea[]={9,3,4,1,3};
        int i=srr.length-1;
        int j=sea.length-1;
        int max=Math.max(i,j);
        //System.out.println(max);
        int k=max;
        int sum[]=new int[k+1];
        int c=0;
        while(k>=0){
            int d=c;
            if(i>=0){
                d=d+srr[i];
            }
            if(j>=0){
                d=d+sea[j];
            }
            c=d/10;
            d=d%10;
            sum[k]=d;
            i--;
            j--;
            k--;

        }
        if(c!=0){
            System.out.println(c);

        }
        for (int val: sum) {
            System.out.println(val);
        }*/
        Scanner sc= new Scanner(System.in);
        int arr1[]={9,9};
        int arr2[]={1};
        sum(arr1, arr2);
        
    }
}