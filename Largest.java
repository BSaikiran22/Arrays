import java.util.*;
public class Largest {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter SIze of an array : ");
        int size =sc.nextInt();
        int arr1[]=new int[size];
        for(int i = 0; i<arr1.length; i++){
            System.out.println("Enter element at index "+i+" : ");
            arr1[i] = sc.nextInt(); 

        }        
        System.out.println("Largest element in array : " + sort(arr1));
        }
        static int sort(int arr[]){
            Arrays.sort(arr);
            return arr[arr.length - 1];

        }

    }
    

