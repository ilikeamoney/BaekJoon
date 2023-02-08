package BaekJoon.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백으로 구분

        String[] arr = new String[2]; // 문자열 배열

        int A = 0; // 정수 A
        int B = 0; // 정수 B

        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken(); // 공백을 기준으로 입력된 값이 배열에 들어감
        }

        // 숫자들을 뒤집어서 변수에 넣어주는 로직
        A += (arr[0].charAt(2) - '0') * 100;
        A += (arr[0].charAt(1) - '0') * 10;
        A += arr[0].charAt(0) - '0';

        B += (arr[1].charAt(2) - '0') * 100;
        B += (arr[1].charAt(1) - '0') * 10;
        B += arr[1].charAt(0) - '0';

        // 3항 연사자 사용
        System.out.println((A > B) ? A : B);
    }
}
