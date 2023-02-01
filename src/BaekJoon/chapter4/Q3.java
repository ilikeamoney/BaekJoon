package BaekJoon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 출력
        StringBuilder sb = new StringBuilder();

        // 배열 크기를 정할 변수
        int N = Integer.parseInt(br.readLine());

        // 값이 들어갈 배열 선언
        int[] arr = new int[N];

        // 문자열 공백으로 구분
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 공백을 기준으로 리스트에 정수값 입력
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 배열 정렬
        Arrays.sort(arr);

        // 첫번쨰 값은 작은 값 뒤에는 가장 큰 값
        System.out.print(arr[0] + " " + arr[arr.length - 1]);
    }
}
