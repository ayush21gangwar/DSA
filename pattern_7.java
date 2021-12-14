import java.util.*;
public class pattern_7 {
    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner src= new Scanner(System.in);
        int n= src.nextInt();
        int i= 1;
        while(i<=n){
            int value=i;
            int j=1;
            while(j<=i){
                System.out.print("  " +value);
                value=value+1;
                j=j+1;

            }
            System.out.println("  ");
            i=i+1;
        }

    }
}