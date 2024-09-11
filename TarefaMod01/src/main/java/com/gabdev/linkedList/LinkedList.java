package com.gabdev.linkedList;

import com.gabdev.node.Node;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void push(Node<T> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(newNode);
        }
        size++;
    }

    public void insert(int index, Node<T> newNode) {
        if (index < 0 || index > size) throw new RuntimeException();

        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }

            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    public Node<T> pop() {
        if (head == null) throw new RuntimeException();

        Node<T> current = head;
        Node<T> previous = null;

        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null) {
            head = null;
        } else {
            previous.setNext(null);
        }

        size--;
        return current;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new RuntimeException();

        if (index == 0) {
            head = head.getNext();
        } else {
            Node<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    public Node<T> elementAt(int index) {
        if (index < 0 || index >= size) throw new RuntimeException();

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node<T> current = head;

        while (current != null) {
            System.out.print(current.getE() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
