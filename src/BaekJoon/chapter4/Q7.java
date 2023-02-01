package BaekJoon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 횟수
        int N = Integer.parseInt(br.readLine());

        // 문자열 배열
        String[] str = new String[N];

        int total = 0;

        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < str.length; i++) {

            int cnt = 0;
            int sum = 0;

            for (int j = 0; j < str[i].length(); j++) {

                if (str[i].charAt(j) == 'O') {
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}
