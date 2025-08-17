package numbers;

public class Pattern {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int dup=x;
        int rev=0;
        while (dup!=0){
            int remainder=dup%10;
            rev=rev*10+remainder;
            dup=dup/10;
        }
        if(x==rev)
        return true;
        else  {
            return false;
        }
    }
}
