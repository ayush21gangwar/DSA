import java.util.*;
public class pattern_one {
    public static void main(String[] args) {
        System.out.print("enter the value");
        Scanner src=new Scanner(System.in);
        int n= src.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(" " +"*");
                j=j+1;
            }
            System.out.println("");
            i=i+1;
        }

    }
}

