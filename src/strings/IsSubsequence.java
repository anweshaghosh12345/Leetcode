package strings;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty())
            return true;
        if( s.length()>t.length())
            return false;
        int i=0,j=0;
        while (j<t.length()){
            if(i<s.length() && s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}
