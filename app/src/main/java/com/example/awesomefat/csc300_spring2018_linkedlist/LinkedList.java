package com.example.awesomefat.csc300_spring2018_linkedlist;

/**
 * Created by awesomefat on 1/30/18.
 */

public class LinkedList
{
    private Node head;

    public LinkedList()
    {
        this.head = null;
    }

    public void addFront(int payload)
    {
        Node n = new Node(payload);
        this.head = n;
    }

    public void display()
    {
        if(this.head == null)
        {
            System.out.println("Empty List");
        }
        else
        {
            System.out.println(this.head);
        }
    }
}
