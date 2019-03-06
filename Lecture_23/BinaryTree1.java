package com.codingblocks.Lecture_23;

import java.util.Scanner;

public class BinaryTree1 {
    private Node root;
    private class Node{
        private int value ;
        private Node left ;
        private Node right ;
        public Node(int value )
        {
            this.value = value ;
        }

    }
    public void add(Scanner s )
    {
        this.root = add(this.root,s);
    }
    private Node add(Node node , Scanner s ) {
        if (node == null) {
            System.out.println("Enter the value to add");
            int value = s.nextInt();
            Node n = new Node(value);
            return n;
        }
        System.out.println("Enter true for left , false for right");
        boolean isleft = s.nextBoolean();
        if (isleft){
            node.left = add(node.left ,s);

        }
        else
        {
            node.right = add(node.right ,s);
        }
        return node;
    }

}
