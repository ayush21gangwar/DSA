import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("enter the value of x and y");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        System.out.println("before swappin numbers are" +x+""+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping numbers are" +x+""+y);
       
    }
}
