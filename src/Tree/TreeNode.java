package Tree;

public class TreeNode {

    int val;
      Tree.TreeNode left;
      Tree.TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, Tree.TreeNode left, Tree.TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
