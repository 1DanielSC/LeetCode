class Solution {
    
    /*
    *   If the current char is either ')', ']' or '}', then the most recent closing must match with it.
    *   E.g., if the current char is ')', then the most recent closing-bracket must be '('
    *
    *   For storing the most recent bracket, we will use a STACK.
    *       because the most recent element added is the first to be removed.
    */
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
