package Tree;

//import com.sun.source.tree.Tree;


import java.util.*;

public class PreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        preorder(root,arr);
        return arr;
    }
    public void preorder(TreeNode node,ArrayList<Integer> arr){

        if(node==null)
            return;
        arr.add(node.val);
        preorder(node.left,arr);
        preorder(node.right,arr);
    }
}
