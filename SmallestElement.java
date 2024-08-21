import java.util.*;
public class SmallestElement{
    public static void main(String[] args) {
        int[] arr1 = {60, 20, 30, 40, 50};
        System.out.println("SMallest element at array is : " + sort(arr1));
    }
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[0];
        }
    }