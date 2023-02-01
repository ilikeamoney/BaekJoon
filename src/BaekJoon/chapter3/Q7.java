package BaekJoon.chapter3;

import java.io.*;
import java.util.StringTokenizer;

public class Q7 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자열 분리 대기
        StringTokenizer st;

        // N을 입력 받는다.
        int T = Integer.parseInt(br.readLine());


        for (int i = 1; i < T + 1; i++) {
            // StringTokenizer 생성
            st = new StringTokenizer(br.readLine(), " ");
            // A를 입력 받는다.
            int A = Integer.parseInt(st.nextToken());
            // B를 입력 받는다.
            int B = Integer.parseInt(st.nextToken());
            // 중요한건 괄호로 연산부분을 표시해 주어야 제대로 연산이 됨
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
        }
        bw.close();
    }
}
