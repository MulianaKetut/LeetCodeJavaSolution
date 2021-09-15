/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author muliana_ketut
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        System.out.println(s);
        System.out.println(new StringBuffer(s).reverse().toString());
//        if(!s.equals(new StringBuffer(s).reverse().toString())){
//            return false;
//        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        
        ValidPalindrome p = new ValidPalindrome();
        System.out.println(p.isPalindrome(s));
    }
}
