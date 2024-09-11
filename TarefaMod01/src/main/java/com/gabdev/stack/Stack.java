package com.gabdev.stack;

import com.gabdev.node.Node;

public class Stack<T> {
    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(Node<T> newNode) {
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public Node<T> pop() {
        if (this.isEmpty()) throw new RuntimeException("Pilha vazia");

        Node<T> removedNode = top;
        top = top.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public Node<T> top() {
        if (this.isEmpty()) throw new RuntimeException("Pilha vazia");
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
