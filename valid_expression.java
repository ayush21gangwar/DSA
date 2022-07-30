class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
        Stack<Character> s2= new Stack<>();
      for(char i: s.toCharArray()){
          if(i=='('||i=='{'||i=='['){
              s2.push(i);
          }
          else if((i==')')&& !s2.isEmpty()&& s2.peek()=='('){
              s2.pop();
          }
           else if((i==']')&& !s2.isEmpty()&& s2.peek()=='['){
              s2.pop();
          }
           else if((i=='}')&& !s2.isEmpty()&& s2.peek()=='{'){
              s2.pop();
          }
      }
      return s2.isEmpty();
    }
} 