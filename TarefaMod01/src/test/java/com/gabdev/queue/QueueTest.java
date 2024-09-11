package com.gabdev.queue;

import com.gabdev.node.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    private Queue<Integer> queue;

    @Before
    public void pre() {
        queue = new Queue<>();
        queue.enqueue(new Node<>(1));
        queue.enqueue(new Node<>(2));
        queue.enqueue(new Node<>(3));
    }

    @Test
    public void enqueueAndSizeTest() {
        assertEquals(3, queue.size());
        queue.enqueue(new Node<>(4));
        queue.enqueue(new Node<>(5));
        assertEquals(5, queue.size());
    }

    @Test
    public void isEmptyAndDequeueTest() {
        assertFalse(queue.isEmpty());
        queue.dequeue();
        queue.dequeue();
        assertEquals(1, queue.size());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void frontAndRearTest() {
        Node<Integer> node1 = new Node<>(44);
        queue.enqueue(node1);
        assertEquals(node1, queue.rear());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(node1, queue.front());
    }
}
