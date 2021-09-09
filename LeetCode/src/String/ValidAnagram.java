/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Arrays;

/**
 *
 * @author muliana_ketut
 */
public class ValidAnagram {
    
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        
        Arrays.sort(ss);
        Arrays.sort(tt);
        if(ss.length != tt.length){
            return false;
        }
        for (int i = 0; i < tt.length; i++) {
            if(ss[i]!=tt[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        
        ValidAnagram v = new ValidAnagram();
        
        System.out.println(v.isAnagram(s, t));
    }
}
