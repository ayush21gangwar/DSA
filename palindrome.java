class HelloWorld {
    public static void main(String[] args) {
       int r;
       int temp;
       int sum=0;
       int nums=545;
       temp=nums;
       while(nums>0){
           r=nums%10;
           sum=(sum*10)+r;
           nums=nums/10;
       }
       if(temp==sum)
       System.out.println("palindrome");
       else
       System.out.println("not palindrome");
    }
}
