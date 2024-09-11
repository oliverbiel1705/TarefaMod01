package com.gabdev.node;

import lombok.*;

@Data @AllArgsConstructor
public class Node<T> {
    private T e;
    private Node<T> next;

    public Node(T e) {
        this.e = e;
        this.next = null;
    }
}
