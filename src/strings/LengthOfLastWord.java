package strings;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s=s.strip();
        int k=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)!=' ')
                k++;
            else if (s.charAt(i)==' ') {
                break;
            }
        }
        return k;
    }
}
