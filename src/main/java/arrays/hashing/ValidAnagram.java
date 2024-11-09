package arrays.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {

    /**
     *  Given two strings s and t, return true if t is anagram of s, and false otherwise
     * @param s
     * @param t
     * @return boolean
     */

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : t.toCharArray()) {
            if (!map.containsKey(c) )
                return false;
            if (map.get(c) == 1)
                map.remove(c);
            else
                map.put(c, map.get(c) - 1);
        }
        return map.isEmpty();
    }
}
