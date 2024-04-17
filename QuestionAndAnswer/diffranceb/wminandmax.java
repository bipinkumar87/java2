/*
 * question
 * find diff b/w min element and max element from Array
 * ie 2,4,1,9
 * 9-1
 * 8
 */

package QuestionAndAnswer.diffranceb;
import java.util.Scanner;
public class wminandmax {
    public static int diff(int arr[]){
        int max=arr[0];
        int min=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
                min=arr[i];
            }
        }
        int diff1=max-min;
        return diff1;
    }
    public static void main(String args[]){
        int arr[]={4,7,9,1,11};
        int ans=diff(arr);
        System.out.println(ans);
    }
}
