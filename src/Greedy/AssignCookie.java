package Greedy;

import java.util.Arrays;

public class AssignCookie {
    public int findContentChildren(int[] g, int[] s) {
    int greed=0;
    int cookie=0;
        Arrays.sort(g);
        Arrays.sort(s);
    while (greed<g.length && cookie<s.length){
        if(g[greed]<=s[cookie]){
            greed++;
        }
        cookie++;
    }
    return greed;
    }
}
