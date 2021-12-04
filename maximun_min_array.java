import java.util.*;
public class maximun_min_array {
    public static void main(String[] args) {
        int a[]={10,20,35,36,78,98,23,44,55,33};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
            System.out.print("maximum" + a[a.length-1]);
        System.out.println("minimum" +a[0]);
    }
}
