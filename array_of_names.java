
import java.util.*;
public class array_of_names {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        String names[]= new String[size];
        for (int i = 0; i <size ; i++) {
            names[i]= sc.next();


        }
        for (int i = 0; i <names.length ; i++) {
            System.out.println("names is " +names[i]);
            
        }
    }
}
