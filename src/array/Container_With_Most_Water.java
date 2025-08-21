package array;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int area=0;
        int start=0;
        int end=height.length-1;

        while (start<end){
            int ar;
            if(height[start]<height[end]){
               ar=height[start]*(end-start);
               area=Math.max(area,ar);
               start++;
            }
            else {
                ar=height[end]*(end-start);
                area=Math.max(area,ar);
                end--;
            }
        }
        return area;
    }
}
