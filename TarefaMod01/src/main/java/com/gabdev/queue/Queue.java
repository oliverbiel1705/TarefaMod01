package com.gabdev.queue;

import com.gabdev.node.Node;

public class Queue<T> {
    private Node<T> start;
    private Node<T> end;
    private int size;

    public Queue() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public void enqueue(Node<T> newNode) {
        if (this.isEmpty()) {
            start = end = newNode;
        } else {
            end.setNext(newNode);
            end = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (this.isEmpty()) throw new RuntimeException("Fila vazia. Não é possível remover elementos.");

        start = start.getNext();
        if (start == null) {
            end = null;
        }
        size--;
    }

    public Node<T> front() {
        if (this.isEmpty()) throw new RuntimeException("Fila vazia.");
        return start;
    }

    public Node<T> rear() {
        if (this.isEmpty()) throw new RuntimeException("Fila vazia.");
        return end;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return start == null;
    }
}
