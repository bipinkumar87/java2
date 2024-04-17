import java.util.Scanner;
public class findmaxmin{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter element of array");
        for(int i=0;i<size;i++){
            System.out.println("enter"+ (i+1)+ "element");
            arr[i]=sc.nextInt();
       }
    }
}