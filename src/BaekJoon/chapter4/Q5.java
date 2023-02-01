package BaekJoon.chapter4;

import java.io.*;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력구분 대기
        StringTokenizer st;

        // 반복문은 0 부터 카운트 하기 때문에 배열의 크기는 31
        int[] arr = new int[31];


        for (int i = 1; i < 29; i++) {

            st = new StringTokenizer(br.readLine(), "\n");

            // 과제를 제출한 학생 출석번호를 입력
            int success = Integer.parseInt(st.nextToken());

            // 과제를 제출한 학생은 1이라는 값을 받음
            arr[success] = 1;
        }
        // 배열 전체를 순회 한다.
        for (int i = 1; i < arr.length; i++) {

            // 만약 값이 1을 부여받지 않은 학생이 있다면
            if (arr[i] != 1) {
                // 그 번호를 출력하시오
                System.out.println(i);
            }
        }

        // 그러면 값 1을 부여받지 않은 번호는 0인가??
    }
}
