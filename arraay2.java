import java.util.Scanner;
public class arraay2{
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int arr[]=new int[row];
        System.out.println("enter no");
        for(int i=0;i<row;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("no are");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}