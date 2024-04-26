package LeetCode;

public class anagramEy {
    public static void main(String[] args) {
        String s1 = "rasp";
        String s2 ="spar";
        if(s1.length()!=s2.length()){
            System.out.println("Not an anagram");
            System.exit(0);;
        }
        int [] count = new int[26];
        for(int i = 0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        
        for(int k: count){
            if(k!=0){
                System.out.println("Not an Anagram");
            }
        }

        System.out.println("Anagram : "+s1);
    }
}
