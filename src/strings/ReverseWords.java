package strings;

public class ReverseWords {
    public String reverseWords(String s) {
        String ans="";
        String ar[]=s.trim().split("\s+");

        for (int i = 0; i <ar.length ; i++) {
                    ans=ar[i]+" "+ans;


            }
        ans=ans.trim();
        return ans;
    }
}
