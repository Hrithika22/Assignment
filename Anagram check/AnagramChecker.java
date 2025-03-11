import java.util.HashMap;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {  //lengths of two strings should be equal to be anagram 
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i<str1.length();i++){
            char ch = str1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            if(hm.containsKey(ch)== false){
                return false;
            }
            else if(hm.get(ch)==1){
                hm.remove(ch);
            }
            else{
                hm.put(ch, hm.get(ch)-1);
            }
        } 
        return true;     
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        scn.close();
        System.out.println(isAnagram(str1, str2));
        }
    }
