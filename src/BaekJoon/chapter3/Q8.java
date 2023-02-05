package BaekJoon.chapter3;

import java.io.*;

public class Q8 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        int N = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
