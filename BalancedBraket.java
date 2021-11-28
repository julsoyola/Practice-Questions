import java.util.*;
// Add any extra import statements you may need here


class Main {
  // Add any helper functions you may need here
  
  
  boolean isBalanced(String s) {
    // Write your code here
     Stack<Character> stack = new Stack<>();
   
    for(int i = 0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(ch=='{'||ch=='('||ch=='['){
        stack.push(ch);
      }else if(stack.isEmpty()){
        return false;
      }
      else if(ch=='}'){
        if(stack.peek()=='{'){
          stack.pop();
        }
        else{return false;}
        
      }else if(ch==']'){
        if(stack.peek()=='['){
          stack.pop();
        }
        else{return false;}
           
      }else if(ch==')'){
        if(stack.peek()=='('){
          stack.pop();
        }
        else{return false;}
               
      }
    }
    if(!stack.isEmpty()){
      return false;
    }
    return true;
  }
