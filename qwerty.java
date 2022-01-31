
import java.util.*;
public class qwerty {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= src.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i <n ; i++) {
            arr[i]=src.nextInt();

        }
        System.out.println("enter the element to be searched");
        int key=src.nextInt();
        int result=Arrays.binarySearch(arr,key);
        if(result<0)
            System.out.println("element not found");
        else
            System.out.println("element is found at index" +result);
    }

    }




