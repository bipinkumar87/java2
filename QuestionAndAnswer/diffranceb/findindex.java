package QuestionAndAnswer.diffranceb;
import java.util.Scanner;
public class findindex {
    public static int inde(int arr[],int findIndex){
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==findIndex){
               n=i; 
            }
        }

        return n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        System.out.println("enter a num");
        int num=sc.nextInt();
        System.out.println("enter element of array");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int ind= inde(arr, num);
        System.out.println("index are : "+ind);

    }

}
