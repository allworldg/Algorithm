package 其他;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Classname 有效的括号
 * @Description TODO
 * @Date 2020/10/7 21:46
 * @Created by 94493
 */
public class 有效的括号 {
    public static void main(String[] args) {
        isValid("()");
    }
    public static boolean isValid(String s) {
            int n = s.length();
            if(n%2!=0){
                return false;
            }

            HashMap<Character,Character> hashMap = new HashMap<Character, Character>(){{
                put(')','(');
                put('}','{');
                put(']','[');
            }};
            Deque<Character> stack = new LinkedList<>();
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                if(hashMap.containsKey(ch)){
                    if(stack.isEmpty()||stack.peek()!=hashMap.get(ch)){
                        return false;
                    }
                    stack.pop();
                }
                else {
                    stack.push(ch);
                }

            }
            return stack.isEmpty();
    }
}
