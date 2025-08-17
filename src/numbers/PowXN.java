package numbers;

public class PowXN {
    public static double myPow(double x, int n) {
        if(n<0) {
            double c = pow(x, -1 * n);

            return 1 / c;
        }
        else
            return pow(x,n);

    }
    public static double pow(double x,int n){
        if(n==0)
            return 1.0;
        double c=x*pow(x,n-1);
        return c;
    }
    public static void main(String[]args){
        System.out.println(myPow(2.00000,10));
    }

}
