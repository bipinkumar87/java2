package array;

public class merg {
    public static void main(String a[]){
        int i=0,j=0,k=0;
        int arr1[]={1,3,5,7};
        int arr2[]={2,4,6,8};
        int n1=arr1.length;
        int n2=arr2.length;
        int arr3[]=new int[n1+n2];
        int p=0;

       // while(i<n1 && j<n2){
         while(p<=(n1+n2)/2){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                ++p;
                //k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                ++p;
                //k++;
            }
            k++;
            System.out.print("p is"+p);
           

        }
        
        
       /*  while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while(j<n2)
        {
            arr3[k++]=arr2[j++];
        }*/
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while(j<n2)
        {
            arr3[k++]=arr2[j++];
        }
        for(int l=0;l<n1+n2;l++){
            System.out.println(arr3[l]);
        }
        
    }
    
}
