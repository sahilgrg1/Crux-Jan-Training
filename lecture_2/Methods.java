package com.codingblocks.lecture_2;

public class Methods {
    public static void main(String[] args) {
        eat();
        int v = eatWithReturn();
        eatFruit(67);
        int s = sum(65, 45);
        System.out.println(s);


    }

    public static void eat() {
        System.out.println(" yumm yumm ");
    }

    public static int eatWithReturn() {
        System.out.println("return ");
        return 50;
    }

    public static void eatFruit(int val) {
        System.out.println("eating" + val);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
