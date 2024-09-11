package com.gabdev.linkedList;

import com.gabdev.node.Node;
import lombok.var;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList<Integer> list;

    @Before
    public void pre() {
        list = new LinkedList<>();
        list.push(new Node<>(1));
        list.push(new Node<>(2));
        list.push(new Node<>(3));
    }

    @Test
    public void pushAndSizeTest() {
        list.push(new Node<>(44));
        assertEquals(4, list.size());
    }

    @Test
    public void popTest() {
        Node<Integer> propped = list.pop();
        assertEquals(Integer.valueOf(3), propped.getE());
        assertEquals(2, list.size());
    }

    @Test
    public void insertTest() {
        list.insert(1, new Node<>(77));
        var res = list.elementAt(1);
        assertEquals(Integer.valueOf(77), res.getE());
        assertEquals(4, list.size());
    }

    @Test
    public void removeTest() {
        list.remove(1);
        var res = list.elementAt(1);
        assertEquals(Integer.valueOf(3), res.getE());
        assertEquals(2, list.size());
    }

    @Test
    public void elementAtTest() {
        var res = list.elementAt(1);
        assertEquals(Integer.valueOf(2), res.getE());
    }

    @Test
    public void printListTest() {
        list.printList();
    }
}
