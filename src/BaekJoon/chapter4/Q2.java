package BaekJoon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 문자 입력

        StringBuilder sb = new StringBuilder(); // 출력 문자를 담는다.

        int N = Integer.parseInt(st.nextToken()); // 배열의 크기

        int T = Integer.parseInt(st.nextToken()); // 비교할 값

        int[] arr = new int[N];

        StringTokenizer sz = new StringTokenizer(br.readLine(), " "); // 공백으로 구분

        for (int  i = 0;  i < arr.length;  i++) { // 배열의 길이 만큼 반복
            arr[i] = Integer.parseInt(sz.nextToken()); // 배열 인덱스 마다 요소값을 지정
            if (arr[i] < T) { // 배열 요소들이 T보다 작은 조건인 경우
                sb.append(arr[i]).append(" "); // 그 값을 추가
            }
        }
        System.out.println(sb); // 출력
    }
}
