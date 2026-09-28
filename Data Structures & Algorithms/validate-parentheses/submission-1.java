class Solution {
    public boolean isValid(String s) {
        Stack<Character>bag=new Stack<>();

        char[]ch=s.toCharArray();

        for(char c:ch){
            if(c=='('||c=='{'||c=='['){
                bag.push(c);
            }
            else{
               
                if(bag.isEmpty()){
                    return false;
                }
                 char top=bag.pop();

                if(c=='}'&&top!='{'||c==']'&&top!='['||c==')'&&top!='('){
                    return false;
                }
            }
        }
        return bag.isEmpty();
 
    }
}
