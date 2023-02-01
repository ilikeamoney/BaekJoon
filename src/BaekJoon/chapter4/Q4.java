package BaekJoon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 구분
        StringTokenizer st;

        // 배열 선언
        int[] arr = new int[9];

        // 최댓값을 비교할 배열에 인덱스
        int max = arr[0];

        // 값을 찾을때 마다 카운팅 해줄 변수
        int cnt = 0;

        // 3, 29, 38, 12, 57, 74, 40, 85, 61

        for (int i = 0; i < arr.length; i++) {
            // 개행을 기준으로 문자열을 읽어드림
            st = new StringTokenizer(br.readLine(), "\n");

            // 배열에 정수 값을 넣는다
            arr[i] = Integer.parseInt(st.nextToken());

            // 만약 배열 인덱스에 있는값이 max 보다 크다는 조건이 맞다면
            if (arr[i] > max) {
                // 그 배열에 있던 수가 max 값이 된다
                max = arr[i];
                // 인덱스 + 1 값이 카운트 변수에 들어간다.
                // 어떻게 이런 생각을 할 수 있을까..
                cnt = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
        }
}

