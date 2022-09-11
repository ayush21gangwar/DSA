import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	   public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
      	int[] A= new int[N];
  
    	for(int i=0;i<A.length;i++){
    	    A[i]=sc.nextInt();
    	}
    	int[]arr= new int[N];
    	int k=0;
		for(int j=A.length-1; j>=0; j--){
		   arr[k] = A[j];
		   k++;
		}
			for(int i=0;i<N;i++) {
            System.out.print(arr[i]+" ");
			    
			}
    }
}
