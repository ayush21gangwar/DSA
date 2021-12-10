import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = src.nextInt();
        System.out.println("enter the values ");
        int arr[] = new int[n];
        for(int k=0;k<arr.length;k++){
            arr[k]=src.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i <n ; i++)
        {
            System.out.print(" " +arr[i]);
        }
        }

    }


