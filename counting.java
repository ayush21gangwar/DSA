import java.util.*;
public class counting {
    public static void counting(int n) {
        int counting = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        return ;
    }
    public static void main(String[] args) {
      Scanner src= new Scanner(System.in);
      int n= src.nextInt();
       counting(n);
    }
}

