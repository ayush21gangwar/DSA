import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        int i;
        Scanner src = new Scanner(System.in);
        System.out.println("input the size of array");
        int n= src.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements of array");
        for (i = 0; i < a.length; i++) {
            a[i] = src.nextInt();
        }
        System.out.println("enter the element to be searched");
        int key = src.nextInt();
        for ( i = 0; i <a.length ; i++) {
            if (a[i] == key) {
                System.out.println("element found");
                break;
            }
        }
        if (i==n){
            System.out.println("element not found");
        }
    }}


