import java.util.Scanner;
public class array3{
    public static void main(String args[]){
        //first we are take input for array
        System.out.println("enter size of array");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        //take input for array
        System.out.println("enter number");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("out put are ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}