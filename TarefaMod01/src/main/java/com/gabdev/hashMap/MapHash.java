package com.gabdev.hashMap;

public class MapHash {
    private final int size = 10;
    private final int[] value;
    private final int[] key;

    public MapHash() {
        value = new int[size];
        key = new int[size];
    }

    private int hashFunction(int k) {
        return k % size;
    }

    private int treatment(int initIndex, int k) {
        int index = initIndex;
        while (key[index] != 0 && key[index] != k) {
            index = (index + 1) % size;
        }
        return index;
    }

    public void put(int k, int v) {
        int indice = hashFunction(k);
        int treatedIndex = treatment(indice, k);

        key[treatedIndex] = k;
        value[treatedIndex] = v;
    }

    public int delete(int k) {
        int index = hashFunction(k);
        int treatedIndex = treatment(index, k);

        if (key[treatedIndex] == 0) {
            return -1;
        }

        int removedValue = value[treatedIndex];

        key[treatedIndex] = 0;
        value[treatedIndex] = 0;

        return removedValue;
    }

    public int get(int k) {
        int indice = hashFunction(k);
        int treatedIndex = treatment(indice, k);

        if (key[treatedIndex] == 0) {
            return -1;
        }

        return value[treatedIndex];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            key[i] = 0;
            value[i] = 0;
        }
    }
}
