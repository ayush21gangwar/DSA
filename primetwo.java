class HelloWorld {
    public static void main(String[] args) {
       int num=32;
       boolean flag= false;
       for(int i=2;i<=num/2;i++){
           if(num%i==0){
           flag= true;
           break;
       }
    }
    if(!flag)
    System.out.println(num+ "prime");
    else
    System.out.println(num+ "not prime");
} 
}