package com.here.competition.task6;

public class TreeAnalyzer {

    /***
     * Finds the depth of binary tree
     * @param root has to be the root of the tree to produce accurate result
     */
    public static int treeDepth(TreeNode root) {
        return path(root);
    }

    private static int path(TreeNode node) {
        if (node == null) return 0;
        return Math.max(path(node.left)+1, path(node.right)+1);
    }
}
