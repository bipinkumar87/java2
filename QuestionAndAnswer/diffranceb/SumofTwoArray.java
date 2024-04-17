
import java.util.Scanner;

import javax.xml.transform.Source;
public class SumofTwoArray {
    public static void display(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of firstr array");
        int size1=sc.nextInt();
        System.out.println("eneter element of first array");
        int arr[]=new int[size1];
        for(int i=0;i<size1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter size of second array");
        int size2=sc.nextInt();
        System.out.println("enter element of second array");
        int aee[]=new int[size2];
        for(int i=0;i<size2;i++){
            aee[i]=sc.nextInt();
        }

    }
    public static int[] sum(int arr1[],int arr2[]){
        int fsize=(arr1.length>arr2.length)?arr1.length:arr2.length;
        int arr[]=new int[fsize];
        int i=arr1.length;
        int j=arr2.length;
        int k=0;
        while(fsize>=0){

        }
        return arr;
    }
    public static void main(String args[]){
        SumofTwoArray sm=new SumofTwoArray();
        sm.display();
    }
    
}
