package BaekJoon.chapter3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 9 + 1; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
