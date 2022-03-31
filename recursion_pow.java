import java.util.*;
public class recursion_pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter power value");
        int n = sc.nextInt();
        int ans = pow(n);
        System.out.println(ans);
    }

    static int pow(int n) {
        if (n==0)
            return 1;
        else
            return 2*pow(n-1);
    }
}
