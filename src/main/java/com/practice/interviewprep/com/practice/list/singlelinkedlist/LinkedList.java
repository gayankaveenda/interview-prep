package com.practice.interviewprep.com.practice.list.singlelinkedlist;

public class LinkedList<T> {

    class Node<T> {
        Node<T> next;
        T data;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public synchronized void push(T data) {
        if (data == null) {
            return;
        }

        if (head == null) {
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public synchronized void append(T data) {

        if(head == null) {
            push(data);
        }

        Node<T> previous = null;
        Node<T> node = head;

        while (node != null) {
            previous = node;
            node = node.next;
        }
        previous.next = new Node<>(data);
    }

    public Node<T> getTail() {
        if(head == null) {
            return null;
        }

        Node<T> previous = null;
        Node<T> node = head;

        while (node != null) {
            previous = node;
            node = node.next;
        }
       return previous;
    }

    public void print() {
        if (head == null) {
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(",");
            }
            node = node.next;
        }
        System.out.println();
    }
}
