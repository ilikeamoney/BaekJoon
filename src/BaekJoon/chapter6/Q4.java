package BaekJoon.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력

        StringTokenizer st; // 문자열 구분 대기

        int R; // 한 단어 반복 횟수
        String S; // 문자열

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " "); // 문자열 공백으로 구분

            R = Integer.parseInt(st.nextToken()); // 반복 횟수 입력
            S = st.nextToken(); // 각 단어마다 반복할 문자 입력
            for (int j = 0; j < S.length(); j++) { // J = 0 이면
                for (int k = 0; k < R; k++) { // R = 3 K = 0, 1, 2 반복
                    System.out.print(S.charAt(j)); // S.charAt(0) 0, 1 2 출력
                }
            }
            System.out.println();
        }
    }
}
