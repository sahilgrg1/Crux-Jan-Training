package com.codingblocks.Lecture_23;

import java.util.LinkedList;
import java.util.Queue;
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
    public void Indent()
    {
        display("",this.root,"root");
    }
    public void display(String indent , Node node,String type)
    {
        if(node == null)
        {
            return ;
        }
        System.out.println(indent + node.value);
        display(indent + "\t",node.left,"left");
        display(indent +"\t" , node.right,"right");
    }
    public void preoder(Node node)
    {
        if(node == null)
        {
            return ;
        }
        System.out.println(node.value+" ");
        System.out.println(node.left);
        System.out.println(node.right);
    }
    void pre()
    {
        preoder(root);
    }
    public int depth(Node node)
    {
        if( node == null)
        {
            return 0 ;
        }
        return Math.max(depth(node.left),depth(node.right))+1;
    }
    public int diameter()
    {
        if(root == null)
        {
            return 0 ;
        }
        return depth(root.left) +depth(root.right) + 1 ;
    }
    public boolean find (int target)
    {
        return find(root, target);
    }
    private boolean find(Node node , int target)
    {
        if(node == null)
        {
            return false ;
        }
        if( node.value == target)
        {
            return true ;
        }
        return find(node.left,target) || find(node.right,target);
    }
//    public void populateByPreIn(int[] pre , int[] in )
//    {
//        this.root = poplulateByPreIn(pre, in);
//    }
    public void levelorder(){
        if(root == null)
        {
            return ;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node node = queue.remove();
            System.out.println(node.value);
            if(node.left != null)
            {
                queue.add(node.right);
            }
        }

    }
}
