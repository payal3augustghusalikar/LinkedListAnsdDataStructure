package com.linkedlist;

import java.awt.*;

public class MyNode<K> implements INode<K> {

    private K key;
    private INode next;

    public MyNode(int i) {
        this.key = null;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = (MyNode<K>)next;
    }
}
