class Solution {
    public boolean isValid(String s) {
       
       Stack<Character>bag=new Stack();
       char[]a=s.toCharArray();

       for(char ch:a){
        if(ch=='{'||ch=='('||ch=='['){
            bag.push(ch);
        }

        else if(ch=='}'||ch==']'||ch==')'){
            if(bag.isEmpty()){
                return false;
            }
            char top=bag.pop();
            if(ch==')'&&top!='('||ch=='}'&&top!='{'||ch==']'&&top!='['){
                return false;
            }
        }
       }
       return bag.isEmpty();

        
        
    }
}
