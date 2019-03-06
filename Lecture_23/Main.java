package com.codingblocks.Lecture_23;

import com.codingblocks.Lecture_22.BinaryTree;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("Tree_Data.txt");
       Scanner s = new Scanner(file);
        BinaryTree1 tree = new BinaryTree1();
        for (int i = 0; i < 5 ; i++) {
            tree.add(s);

        }

        System.out.println(tree.diameter());
        tree.Indent();



    }
}
