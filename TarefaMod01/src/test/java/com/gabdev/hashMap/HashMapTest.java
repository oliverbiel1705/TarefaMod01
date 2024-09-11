package com.gabdev.hashMap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashMapTest {
    private MapHash map;

    @Before
    public void setUp() {
        map = new MapHash();
        map.put(55, 55);
    }

    @Test
    public void hashMapSimpleTests() {
        // Delete test
        map.delete(55);
        assertEquals(-1, map.get(55));

        // Put and Get tests
        map.put(44, 44);
        assertEquals(44, map.get(44));

        // Clear test
        map.clear();
        assertEquals(-1, map.get(44));
    }

}
