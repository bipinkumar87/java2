import java.util.Scanner;
public class find1{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of k");
        int k=sc.nextInt();
        System.out.println("enter size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        int end=size-1;
        int start=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>k){
                end=mid-1;
            }
            else if(arr[mid]<k){
                start=mid+1;
            }
            else{
                System.out.println("index are");
                System.out.println(mid);
                break;
            }
        }
        System.out.println("number are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}