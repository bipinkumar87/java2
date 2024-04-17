import java.util.Scanner;
public class arrayssum {
    //public static int c=0;
    //static  int sum1[];

    public static int[] sum(int arr1[],int arr2[]){
        arrayssum ac=new arrayssum();
        int c=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int sum1[]=new int[i>j?i:j];
        int k=sum1.length-1;
        while(k>=0){
            int d=c;
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
    /* 
    public static void display(){
        if(c!=0){
            System.out.println(c);
        }
        for(int val:sum1){
            System.out.println("sum are"+val);
        }
        System.out.println("hello");

    }*/
    public static void main(String a[]){
        Scanner cs=new Scanner(System.in);
        System.out.println("enter size of array");
        int size1=cs.nextInt();
        System.out.println("enter element of array");
        int arr1[]=new int[size1];
        for(int i=0;i<size1;i++){
            arr1[i]=cs.nextInt();
        }
        System.out.println("enter size of array");
        int size2=cs.nextInt();
        System.out.println("enter element of array");
        int arr2[]=new int[size2];
        for(int i=0;i<size2;i++){
            arr1[i]=cs.nextInt();
        }
        sum(arr1, arr2);
        //display();
    }
}
