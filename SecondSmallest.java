import java.util.Scanner;

public class SecondSmallest {
    static int secSmallest(int arr[], int n) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element");
            return -1;
        } else {
            System.out.println("Second Smallest element is : " + secondSmallest);
            return secondSmallest;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        secSmallest(arr, n);
    }
}