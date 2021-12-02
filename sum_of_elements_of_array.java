import java.util.*;
public class sum_of_elements_of_array {
    public static void main(String[] args) {
        int a[]=new int[4];
        int sum=0;
        Scanner src= new Scanner(System.in);

        //int a[]=new int[4];

        for (int i = 0; i <a.length ; i++) {
           // int a[0]=2;
            a[i]=src.nextInt();

        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
            sum=sum+a[i];

        }
        //sum=sum+a[i];
        System.out.println("sum of elements of array" +sum);

    }
}

