class HelloWorld {
    public static void main(String[] args) {
       int n1=0,n2=1,count=10,n3;
       System.out.println(n1+" "+n2);
       for(int i=2;i<count;++i){
           n3=n1+n2;
           System.out.print(" "+n3);
           n1=n2;
           n2=n3;
       }
    }
}