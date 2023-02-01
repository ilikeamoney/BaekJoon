package BaekJoon.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12 {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 출력
        StringBuilder sb = new StringBuilder();

        // 문자열 분리 대기
        StringTokenizer st;

        // 조건문에 활용할 문자열
        String str;


        // 문제 해결 방안
        // 결론은 데이터가 없다는 뜻인 End Of File (EOF) 처리를 해주어야 하는것이 맞는것

        while ((str = br.readLine()) != null) { // 한줄에 입력받은 문자열이 null 이면 break
            st = new StringTokenizer(str, " "); // 한줄을 입력 받는것이 아니라 문자열을 입력받음 공백을 기준으로

            int A = Integer.parseInt(st.nextToken()); // A 입력

            int B = Integer.parseInt(st.nextToken()); // B 입력

            sb.append(A + B).append("\n"); // A + B 를 더하고 줄 바꿈

        }
        System.out.println(sb); // 결과 출력
    }
}
