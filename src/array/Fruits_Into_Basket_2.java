package array;

public class Fruits_Into_Basket_2 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0;
        int n=fruits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if(fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    break;
                }else {
                    continue;
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            if(baskets[i]!=0)
                c++;
        }
        return c;
    }
}