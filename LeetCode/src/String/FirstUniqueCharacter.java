/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author muliana_ketut
 */
public class FirstUniqueCharacter {

    public int firstUniqChar1(String s) {
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (s.indexOf(a[i]) == s.lastIndexOf(a[i])) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar(String s) {
        String a = s.toLowerCase();
        char[] temp = a.toCharArray();
        int j = 0;
        Map<Integer, Integer> maps = new HashMap<>();
        if (temp.length <= 1) {
            return 0;
        }
        while (j < temp.length) {
            int x = 0;
            for (int i = 0; i < temp.length; i++) {
                if (j == i) {
                    continue;
                }
                if (temp[j] == temp[i]) {
                    x++;
                    maps.put(j, x);
                } else {
                    maps.put(j, x);
                }
            }
            if (maps.containsValue(0)) {
                return j;
            }
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "daasgdfb";

        FirstUniqueCharacter f = new FirstUniqueCharacter();

        System.out.println(f.firstUniqChar1(s));
    }
}
