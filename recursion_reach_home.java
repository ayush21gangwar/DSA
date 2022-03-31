import java.util.*;
public class recursion_reach_home {
    void reach_home(int source,int destination){
        System.out.println(source);
        System.out.println(destination);
        if(source==destination){
            System.out.println("reached");
            return;
        }
        else{
            source++;
        }
        reach_home(source,destination);

    }

    public static void main(String[] args) {
        int source= 1;
        int destination=10;
        recursion_reach_home r=new recursion_reach_home();
        r.reach_home(source,destination);
    }
}