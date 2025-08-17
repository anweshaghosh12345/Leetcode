package strings;

public class LenofLastWord {
    public int lengthOfLastWord(String s) {
        int c=0;
        s=s.trim();
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)==' ')
                return c;
            else
                c++;
        }
        return c;
    }
}
