package com.codingblocks.lecture_2;

import java.util.Scanner;

public class Patt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < n - row - 1) {
                System.out.print("   ");
                col++;
            }
            col = 0;
            int k = row + 1;
            while (col < 2 * row + 1) {
                System.out.print( k+ "  ");
                if (col < row) {
                    k++;
                } else {
                    k--;
                }
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
