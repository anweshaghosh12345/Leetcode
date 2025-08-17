package numbers;

import java.util.Arrays;

public class OddToEven {
    public String makeEven(String s) {
        // code here.
        char[] ch=s.toCharArray();
        int even=Integer.MAX_VALUE;
        int indx=0;
        for (int i = 0; i <ch.length ; i++) {
            if((ch[i]-'0')%2==0){
                even=ch[i]-'0';
                indx=i;
            }
            if(even<=ch[ch.length-1]-'0'){
                break;
            }

        }
        if(even==Integer.MAX_VALUE)
            return s;
        char temp=ch[indx];
        ch[indx]=ch[ch.length-1];
        ch[ch.length-1]=temp;

       String ans="";
       for (char c:ch){
           ans+=c;
       }
       return ans;

    }
}