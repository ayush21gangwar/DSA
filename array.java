
import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int age[] = new int[size];
        for (int i = 0; i < size; i++) {
            age[i] = sc.nextInt();

        }
        int x= sc.nextInt();
            for (int i = 0; i < age.length; i++) {
                if(age[i]==x){
                    System.out.println("value of x found at index" +i);
                }

            }
        }
    }

