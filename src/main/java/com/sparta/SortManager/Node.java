package com.sparta.SortManager;

public class Node {
    private int key;
    private Node left, right;

    public Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
