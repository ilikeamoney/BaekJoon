package BaekJoon.chapter3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int num = 0;
        for (int i = 1; i <= length; i++) {
            num += i;
        }
        System.out.println(num);
    }
}
