 
import java.util.Scanner;
public class printChartBar {
    public static void chart(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        for(int i=max;i>0;i--){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>=i){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
        
    }
    
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("ente element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        chart(arr);
        
    }
    
}
