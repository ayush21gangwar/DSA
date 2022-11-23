// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      int num= 32;
       boolean flag = false;
      for(int i=2;i<=num/2;i++){
         if(num%i==0){
            flag=true;
             break;
      }
    }
    if(!flag)
    System.out.println("number is prime"+num);
    else
      System.out.println("number is not  prime"+num);
    }  
}