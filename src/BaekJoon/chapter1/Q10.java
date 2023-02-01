package BaekJoon.chapter1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lis = new int[3];
        for (int i = 0; i < lis.length; i++) {
            lis[i] = sc.nextInt();
        }
        System.out.println((lis[0] + lis[1]) % lis[2]);
        System.out.println(((lis[0] % lis[2]) + (lis[1] % lis[2])) % lis[2]);
        System.out.println((lis[0] * lis[1]) % lis[2]);
        System.out.println(((lis[0] % lis[2]) * (lis[1] % lis[2])) % lis[2]);
    }
}
