package numbers;

public class Count_numbers_containing_4 {
    public static int countNumberswith4(int n) {
        // code here
        int c=0;
        for (int i = 1; i <=n ; i++) {
            if(four(i)) {
                c++;
            }
        }
        return c;
    }
    public static boolean four(int num){
        boolean check=true;
        while (num>0){
            if(num%10==4){
                return true;
            }else {
             check=false;
            }
            num=num/10;
        }
        return check;
    }
}
