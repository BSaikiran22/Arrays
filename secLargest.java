import java.util.Scanner;
import java.util.*;
public class secLargest {
    static int seclargest(int arr[],int n){
        int Largest = arr[n-1];
        for(int i=0; i<n; i++){
            if(arr[i]>Largest)
            Largest = arr[i];
        }
        int sec_Largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]!=Largest && arr[i]<Largest && arr[i]>sec_Largest)
            sec_Largest=arr[i];
        
    }
    System.out.println("The Second Largest element in the array is : ");
    return sec_Largest;

    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ente size of an array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
    System.out.println("Enter the elements at index " +i+ " : ");
    arr[i] = sc.nextInt();
    }


System.out.print("The Largest Element in the array is : " +  seclargest(arr, n));
}
}

