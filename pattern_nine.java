import java.util.*;
public class pattern_nine {
    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner src= new Scanner(System.in);
        int n=src.nextInt();
        char ch='a';
        int i=1;

        while( i <=n) {
            int j=1;
            while(j<=n){
                System.out.print(ch + "");
                j++;
            }
            System.out.println("");
            ch++;
            i++;


        }
    }

}
