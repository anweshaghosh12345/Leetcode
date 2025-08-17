package strings;

public class AlmostEquivalent {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int []w1=new int[26];
        int[]w2=new int[26];
        for (int i=0;i<word1.length();i++){
            char c=word1.charAt(i);
            w1[c-'a']=w1[c-'a']+1;
        }
        for (int i=0;i<word2.length();i++){
            char c=word2.charAt(i);
            w2[c-'a']=w2[c-'a']+1;
        }

        for (int i = 0; i <26 ; i++) {
            if(Math.abs(w1[i]-w2[i])>3)
                return false;
        }
        return true;
    }
}
