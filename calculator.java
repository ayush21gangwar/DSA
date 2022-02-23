 import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("choose 1 for addition");
        System.out.println("choose 2 for subtraction");
        System.out.println("choose 3 for division");
        System.out.println("choose 4 for multiplication");
        System.out.println("choose the operator");
        int op=sc.nextInt();
        System.out.println("input first number");
        int num1= sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        switch(op){
            case 1:{
                int sum= num1+num2;
                System.out.println(sum);
                break;
            }
            case 2:{
                int sub=num1-num2;
                System.out.println(sub);
                break;
            }
            case 3:{
                float div= (num1/num2);
                System.out.println(div);
                break;
            }
            case 4:{
                int mul=num1*num2;
                System.out.println(mul);
                break;
            }
            default:{
                System.out.println("entered wrong input");
            }
        }

    }
}

