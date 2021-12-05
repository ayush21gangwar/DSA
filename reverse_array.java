
import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        System.out.println("print an array");
        int a[]=new int [10];
        Scanner src= new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i]= src.nextInt();
            
        }
        System.out.println("reverse an array");
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }
    }


