package BaekJoon.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1 + i ; k++) {
                System.out.print("*");
            } System.out.println();
        }
    }
}
