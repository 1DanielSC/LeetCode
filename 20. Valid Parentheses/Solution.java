class Solution {
    
    public boolean isValid(String s) {
        
        LinkedList<Character> stack = new LinkedList<>();
        
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.addLast(s.charAt(i));
            
            else if(s.charAt(i) == ')'){
            	  if(stack.isEmpty())
            		  return false;
              
                if(stack.getLast() == '(')
                    stack.removeLast();
                else
                    return false;
            }
            
            else if(s.charAt(i) == ']'){
            	
            	  if(stack.isEmpty())
            		  return false;
            	
                if(stack.getLast() == '[')
                    stack.removeLast();
                else
                    return false;
            }
            else if(s.charAt(i) == '}'){
            	  if(stack.isEmpty())
            		  return false;
              
                if(stack.getLast() == '{')
                    stack.removeLast();
                else
                    return false;
            }

        }
        
        if(!stack.isEmpty())
            return false;

        
        return true;
    }
}
