import java.util.*;
public class pattern_15 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int i = 1;
        while (i <= n) {
            int k=1;
            while(k<=n-i){
                System.out.print(" ");
                k++;
            }
            //int j=n-(i-1);
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;


        }
    }
}

