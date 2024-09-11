package com.gabdev;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        com.gabdev.queue.QueueTest.class,
        com.gabdev.stack.StackTest.class,
        com.gabdev.linkedList.LinkedListTest.class,
        com.gabdev.hashMap.HashMapTest.class
})
public class RunAllTests {
}
