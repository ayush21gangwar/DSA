import java.util.*;
public class binary_search {
    public static int binary_search(int array[],int size,int key){
        int start=0;
        int end=size-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(array[mid]==key){
                return mid;
            }
            if(key>array[mid]){
                 start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        return-1;
    }

    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=src.nextInt();
        int array[]=new int[n];
        System.out.println("enter the elements inside an array");
        for (int index = 0; index <array.length ; index++) {
            array[index]=src.nextInt();

        }
          int index=binary_search(array,5,3);
           System.out.println("index of 3 is" + index);

    }
}

