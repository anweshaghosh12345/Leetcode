package strings;

public class LongestCommonPrefix {
    public  static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String pre=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(pre)!=0){
                pre=pre.substring(0,pre.length()-1);
                System.out.println(pre);
            }
        }
        return pre;
    }
    public static void main(String[] args){
        String[]str=new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
