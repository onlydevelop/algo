package com.example.algo.basic.tree;

public class TreeNode<T> {
    private TreeNode rootNode;

    private TreeNode<T> parentNode;
    private TreeNode<T> leftNode;
    private TreeNode<T> rightNode;
    private T value;

    public TreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(TreeNode rootNode) {
        this.rootNode = rootNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode<T> getParentNode() {
        return parentNode;
    }

    public void setParentNode(TreeNode<T> parentNode) {
        this.parentNode = parentNode;
    }

    public TreeNode(T value) {
        this.value = value;
        this.parentNode = null;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public String toString() {
        return "value: " + value;
    }
}
