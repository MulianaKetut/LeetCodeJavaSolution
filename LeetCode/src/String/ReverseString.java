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
public class ReverseString {

    public String reverseString(String str) {
        //checks if the string is empty   
        if (str.isEmpty()) {  
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String resultantSting1 = rs.reverseString("kata");
        System.out.println(resultantSting1);
    }
}
