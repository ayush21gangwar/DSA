class HelloWorld {
    public static void main(String[] args) {
        int r,sum=0,temp,n;
        n=678;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("Palindrome!");
        else
        System.out.println("not a palindrome");
    }
}
