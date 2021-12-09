import java.util.Scanner;
public class character_array {
    public static void main(String[] args) {
        //char ch[]=new char[10];
        Scanner src= new Scanner(System.in);
        char ch[]=new char[10];
        for(int i=0;i<ch.length;i++){
            ch[i]=src.next().charAt(0);
        }
        for (int i=0;i<ch.length;i++){
            System.out.print(ch[i] +" ");
        }
    }
}
