class Solution {
    public boolean isValid(String s) {

        Stack <Character> stack = new Stack<>();
        Map <Character, Character> map = new HashMap<>();
        //s = "([{}])"

        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for(int i = 0; i < s.length(); i++){

            //have we seen the closing one
            if(map.containsKey(s.charAt(i))){

                if(!stack.isEmpty() && stack.peek() == map.get(s.charAt(i))){
                    stack.pop();
                } else {
                    return false;
                }
    
            }else{               
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}
