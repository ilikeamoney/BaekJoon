package BaekJoon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한줄을 읽는데 공백을 기준으로 읽는다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 변수에 입력 받음
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        // StringBuilder 생성
        StringBuilder sb = new StringBuilder();

        // 위에서 N,X 입력을 받았기 때문에 한번 더 선언한다.
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            // 찾고자 하는 값을 입력 받는다.
            int value = Integer.parseInt(st.nextToken());

            // 조건문으로 해당 되는 값을
            if (value < X)
                // 추가한다.
                sb.append(value).append(' ');
        }
        System.out.println(sb);
    }
}
