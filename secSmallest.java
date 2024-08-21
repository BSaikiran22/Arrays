import java.util.Scanner;
import java.util.*;
public class secSmallest {
    static int secSmallest(int arr[], int n){
        int smallest = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
        }
    }
        int second_Smallest = Interger.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]!=smallest && arr[i]<second_Smallest){
                second_Smallest = arr[i];
                }

            }
        return second_Smallest;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter elements at index "+i+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print(secSmallest(arr,n));
    }

    


    
}
