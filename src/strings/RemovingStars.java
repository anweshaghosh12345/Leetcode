package strings;

import java.util.Arrays;
import java.util.PriorityQueue;

public class RemovingStars {
    public static String clearStars(String s) {
        StringBuilder s1= new StringBuilder();
        if(s.length()==2){
            if(s.charAt(0)=='*')
            {
                s1.append(s.charAt(1));
                return s1.toString();
            }
            else if(s.charAt(1)=='*')
            {

                return "";
            }
            else {
                return s;
            }
        }
        boolean flag=false;
        PriorityQueue<Character>pq=new PriorityQueue<>();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='*') {
                flag=true;
                pq.remove();
            }
            else
                pq.add(s.charAt(i));
        }
        if (!flag)
            return s;
        Object[] ar=pq.toArray();
        System.out.println(Arrays.toString(ar));
        int k=0;
        System.out.println(s);
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j < ar.length ; j++) {
                if(ar[j].equals(s.charAt(i)))
                    s1.append(ar[j]);
            }
        }
        return s1.toString();
    }
    public static void main(String[]args){
        System.out.println(clearStars("c*zb"));
    }
}
