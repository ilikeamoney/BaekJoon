package BaekJoon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        StringTokenizer st; // 문자열 구분

        int[] arr = new int[9]; // 배열 선언

        int max = arr[0]; // 최댓값을 비교할 배열에 인덱스

        int cnt = 0; // 값을 찾을때 마다 카운팅 해줄 변수

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine(), "\n"); // 개행을 기준으로 문자열을 읽어드림

            arr[i] = Integer.parseInt(st.nextToken()); // 배열에 정수 값을 넣는다

            if (arr[i] > max) { // 만약 배열 인덱스 요소에 max 보다 크다는 조건이 맞다면

                max = arr[i]; // 인덱스 요소 값이 max 값이 된다
                cnt = i + 1; // 배열은 0 부터 시작하기 때문에 + 1 한다.
            }
        }
        System.out.println(max); // 최댓값
        System.out.println(cnt); // 최대값이 있는 인덱스
    }
}

