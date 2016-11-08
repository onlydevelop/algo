package com.example.algo.basic.tree;

import java.util.ArrayList;

public class TreeHelper {

    public ArrayList<Integer> getResult() {
        return result;
    }

    private ArrayList<Integer> result = new ArrayList<>();

    private boolean add(TreeNode<Integer> curr, Integer value) {
        if (value == curr.getValue()) return false;
        if (value < curr.getValue()) {
            if (curr.getLeftNode() == null) {
                TreeNode<Integer> newNode = new TreeNode<>(value);
                newNode.setParentNode(curr);
                curr.setLeftNode(newNode);
            } else {
                add(curr.getLeftNode(), value);
            }
        } else {
            if (curr.getRightNode() == null) {
                TreeNode<Integer> newNode = new TreeNode<>(value);
                newNode.setParentNode(curr);
                curr.setRightNode(newNode);
            } else {
                add(curr.getRightNode(), value);
            }
        }
        return true;
    }

    public TreeNode<Integer> init(ArrayList<Integer> nodeValues) {
        TreeNode<Integer> tree = null;
        for(Integer value : nodeValues) {
            if (tree == null)  tree = new TreeNode<Integer>(10);
            add(tree, value);
        }
        return tree;
    }

    public void preorder(TreeNode<Integer> curr) {
        if (curr == null) return;
        visit(curr);
        preorder(curr.getLeftNode());
        preorder(curr.getRightNode());
    }

    public void postorder(TreeNode<Integer> curr) {
        if (curr == null) return;
        postorder(curr.getLeftNode());
        postorder(curr.getRightNode());
        visit(curr);
    }

    public void inorder(TreeNode<Integer> curr) {
        if (curr == null) return;
        inorder(curr.getLeftNode());
        visit(curr);
        inorder(curr.getRightNode());
    }

    private void visit(TreeNode<Integer> curr) {
        result.add(curr.getValue());
    }
}
