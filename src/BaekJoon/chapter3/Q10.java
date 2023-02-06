package BaekJoon.chapter3;

import java.io.*;
import java.util.StringTokenizer;

public class Q10 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        // 무한 루프
        for (int i = 0; i > -1; i++) {
            st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 문자열 구분
            int A = Integer.parseInt(st.nextToken()); // A 입력
            int B = Integer.parseInt(st.nextToken()); // B 입력
            if (A + B == 0) { // 결괏값이 0이면
                break; // 탈출
            }
            bw.write(A + B + "\n");
        }
        bw.close();
    }
}
