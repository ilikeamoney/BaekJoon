package BaekJoon.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {

        // 처음 입력하는 정수 N 은 그 다음 입력할 정수 T 갯수에 해당 됨
        // 두번째에 입력되는 정수 T 의 각 자리값을 다 더한다. ex) 700102 = 10; 숫자 한개 한개 따로 더함
        // 그리고 그 값을 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        int N = Integer.parseInt(br.readLine()); // 문자열 총 길이

        String T = br.readLine(); // 다 더할 문자열로 된 숫자 입력

        int sum = 0; // 다 더한 값을 받을 변수

        for (int i = 0; i < N; i++) {
            // 문자열을 돌면서 각 자리수 마다 더하기 - '0' 을 하는 이유는
            // 아스키 코드 값 말고 원래 숫자 그대로의 값을 더하기 위해
            sum += T.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
