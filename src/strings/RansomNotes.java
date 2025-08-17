package strings;

import java.util.Arrays;

public class RansomNotes {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
            return false;
        int r=0;
        int m=0;
        char [] rn=ransomNote.toCharArray();
        Arrays.sort(rn);
        char[] mag=magazine.toCharArray();
        Arrays.sort(mag);
        while (r<ransomNote.length() && m<magazine.length()){
            if(rn[r]==mag[m]){
                r++;
            }
            m++;
        }
        return r==ransomNote.length();
    }
}
