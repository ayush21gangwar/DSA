import java.util.*;
public class DECIMAL_TO_BINARY {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int ans = 0;
        int i = 0;
        //int a=10;
        while (n != 0) {
            int bit = n & 1;
            ans = (int)(bit * Math.pow(10, i) + ans);
            n=n>>1;
            i++;

        }
        System.out.println(ans);
    }
}
