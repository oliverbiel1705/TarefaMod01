package com.gabdev.stack;

import com.gabdev.node.Node;
import lombok.var;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private Stack<Integer> stack;

    @Before
    public void pre() {
        stack = new Stack<>();
        stack.push(new Node<>(1));
        stack.push(new Node<>(2));
        stack.push(new Node<>(3));
    }

    @Test
    public void pushAndSizeTest() {
        assertEquals(3, stack.size());
        stack.push(new Node<>(4));
        stack.push(new Node<>(5));
        assertEquals(5, stack.size());
    }

    @Test
    public void topTest() {
        var res = stack.top();
        assertEquals(res, stack.top());
    }

    @Test
    public void popAndIsEmptyTest() {
        assertFalse(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
