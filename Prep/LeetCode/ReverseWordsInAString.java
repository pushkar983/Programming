package LeetCode;

import java.util.Stack;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        // String s = "the sky is blue";
        String s = "  hello world  ";
        Stack<String> stack = new Stack<String>();
        String str = "";
        String ans = "";
        for(int i = 0;i<s.length();i++){
            while(i<s.length() && s.charAt(i)!=' '){
                str+=s.charAt(i);
                i++;
            }
            if(str!=""){
                stack.push(str);
                str="";
            }
        }
        while(!stack.isEmpty()){
            ans+=stack.pop();
            if(!stack.isEmpty()) ans+=" ";
        }
        System.out.println(ans);  
    }
}
