import java.util.*;
public class pattern_five {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int n = src.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i) {
                System.out.print(" " +i);
                j = j + 1;

            }
            System.out.println("   ");
            i=i+1;
        }
    }
}
