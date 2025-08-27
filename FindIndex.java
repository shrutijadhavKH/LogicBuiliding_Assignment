import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();

        int[] original = arr.clone();

        Arrays.sort(arr);
        int idxSorted = Arrays.binarySearch(arr, num);

        if (idxSorted >= 0) {
        
            int idxOriginal = -1;
            for (int i = 0; i < original.length; i++) {
                if (original[i] == num) { idxOriginal = i; break; }
            }
            System.out.println("The number " + num + " is found at index " + idxOriginal);
        } else {
            System.out.println("Not Found");
        }
    }
}
