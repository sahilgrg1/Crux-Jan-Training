package com.codingblocks.lecture_2;

public class Assignment {
    public static void main(String[] args) {
     /*   int n = 34;

        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                System.out.println("not a prime");
                return;
            }
            i = i + 1;
        }
        System.out.println("prime");
    }
*/
      /*  int n = 456;
        int count = 5;
        int r;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            if (r == 5) {
                count++;
            }
        }
        System.out.println(count);


    }*/
        int odd = 0;
        int even = 0;
        int n=34567;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            even = even + r;

            r = n % 10;
            n = n / 10;

            odd = odd+ r;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
