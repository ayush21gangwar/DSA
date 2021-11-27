import java.util.*;
public class patternten {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n= src.nextInt();
        int i=1;
        char ch='a';
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(('a'+j-1) +" ");
                j=j+1;
            }
            System.out.println("  ");
            ch++;
            i=i+1;
        }
    }
}

