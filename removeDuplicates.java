import java.util.*;

public class removeDuplicates {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the elements at index " +i+" : ");
            arr[i]=sc.nextInt();
            }
        int k = removeDuplicate(arr);
        System.out.println("The array after removing duplicates is : ");
        for(int i=0; i<k; i++){
            System.out.println(arr[i]  + " ");
        }
        }
        static int removeDuplicate(int [] arr){
            int i=0;
            for(int j=1; j<arr.length; j++){
                if(arr[j]!=arr[i]) {
                    arr[i+1] = arr[j];
                    i++;
            }
        }

        return i+1;
    }

  
    
}
