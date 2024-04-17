import java.util.Scanner;
public class one{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter element of array");
        for(int i=0;i< size;i++){
            System.out.println("enter"+ i +"number");
            arr[i]=sc.nextInt();
        }
        System.out.println("number are");
        for(int i=0;i<=size;i++){
            System.out.println(arr[i]);
        }

    }
}