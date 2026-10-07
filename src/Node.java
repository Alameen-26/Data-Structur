/*
#########################
# Course: COMP 2113 FA01, 2026
# Assignment 3, Question 2
# Author: Adedeji Al-ameen Oladunni Adeniyi Olayemi
# Student ID: 0310392a
# email address: 0310392a@acadiau.ca
# Date: 2026-10-07
# I certify that this code is my own.
# I have not broken any rules concerning Academic Dishonesty.
#########################
*/
public class Node {

    int value;
    String label;

    Node next;
    Node previous;

    /**
     * Creates a new node.
     *
     * @param value integer value
     * @param label node label
     */
    public Node(int value, String label) {
        this.value = value;
        this.label = label;
        this.next = null;
        this.previous = null;
    }

    @Override
    public String toString() {
        return "(" + value + ", " + label + ")";
    }
}