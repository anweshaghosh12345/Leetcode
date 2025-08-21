package array;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs=new HashSet<>();
        int maxi=0;
        int strt=0;
        int end=0;
        while (end<s.length()){
            if(hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
                hs.remove(s.charAt(strt));
                strt++;
            }
            else {
                hs.add(s.charAt(end));
                end++;
                maxi=Math.max(maxi,hs.size());
            }
        }
        return maxi;
    }
}
