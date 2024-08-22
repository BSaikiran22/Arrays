import java.util.*;
public class ReverseOfArray {
    static void printArray(int arr[], int n){
        System.out.println("Reverse of an array is :- ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void reverseArray(int arr[], int n){
        int p1=0, p2=n-1;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
    }
    printArray(arr,n);
}
    public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter size of an array :- ");
       int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            System.out.println("Enter element at index " + i +" :- ");
            arr[i] = sc.nextInt();
        }

        
        reverseArray(arr,n);

    }
    
}
