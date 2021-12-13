import java.util.*;
public class bubble_sort {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = src.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values of array");
        for (int i = 0; i < n; i++) {
            arr[i] = src.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (i = 0; i < n; i++) {
                System.out.print(  arr[i] + "   ");
            }
        }
    }
}
