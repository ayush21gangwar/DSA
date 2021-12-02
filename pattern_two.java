import java.util.*;
public class pattern_two {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int n=src.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                j=j+1;
                System.out.print("i");
                //System.out.print(" ");
            }
            System.out.println(" ");
            i=i+1;
        }
    }
}

