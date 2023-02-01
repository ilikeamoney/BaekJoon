package BaekJoon.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N -1) - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1 + i ; k++) {
                System.out.print("*");
            } System.out.println();
        }
    }
}
