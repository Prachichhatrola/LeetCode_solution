class Solution {
    private int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        calculateDiameter(root);
        return diameter;
    }
    private int calculateDiameter(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = calculateDiameter(node.left);
        int rightHeight = calculateDiameter(node.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
