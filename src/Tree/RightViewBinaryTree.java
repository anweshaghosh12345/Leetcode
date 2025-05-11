package Tree;

import com.sun.source.tree.Tree;

import java.util.*;
//using reverse preorder , RRL
public class RightViewBinaryTree {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        rightView(root,0,ans);
        return ans;
    }
    public void rightView(TreeNode root, int level,ArrayList<Integer> arr){
        if(root==null) {
            return;
        }
        if(level== arr.size()){
            arr.add(root.val);
        }
        rightView(root.right,level+1,arr);
        rightView(root.left,level+1,arr);
    }
}
