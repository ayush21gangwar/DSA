import java.util.*;
public class recursion_fact {
    public static int factorial(int n){
        if(n==0)
            return 1;
        int choti= factorial(n-1);
        int badi= n*choti;
        return badi;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int ans= factorial(n);
        System.out.println(ans);

    }
}

