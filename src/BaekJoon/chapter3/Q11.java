package BaekJoon.chapter3;

import java.io.*;
import java.util.StringTokenizer;

public class Q11 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        for (int i = 0; i > -1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A + B == 0) {
                break;
            }
            bw.write(A + B + "\n");
        }
        bw.close();
    }
}
