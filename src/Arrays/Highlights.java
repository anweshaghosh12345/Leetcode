package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Highlights {
    public static ArrayList<Integer> highlight(ArrayList<Integer> height){
        ArrayList<Integer> highlightOrder=new ArrayList<>();

        while (!height.isEmpty()){
            ArrayList<Integer> hlights=new ArrayList<>();

            for (int i = 0; i <height.size() ; i++) {
                if(height.size()==1)
                    hlights.add(height.get(0));

                else if((height.size()!=1 && ((i==0 )&& height.get(i)>height.get(i+1)) ||
                        ( (i==height.size()-1)&& height.get(i)>height.get(i-1))))
                    hlights.add(height.get(i));

                else if(height.size()!=1 && i!=0 && i!= height.size()-1 && height.get(i)>height.get(i-1) && height.get(i)>height.get(i+1))
                    hlights.add(height.get(i));
            }

            int h= Collections.min(hlights);
            height.remove(Integer.valueOf(h));
            highlightOrder.add(h);
        }
        return highlightOrder;
    }
    public static void main(String[] args){
        ArrayList<Integer> input=new ArrayList<>();
        input.add(2);
        input.add(7);input.add(8);input.add(5);input.add(1);input.add(6);
        input.add(3);input.add(9);input.add(4);
        System.out.println(input);

        System.out.println(highlight(input));

    }
}
