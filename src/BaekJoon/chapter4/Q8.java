package BaekJoon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        int N = Integer.parseInt(br.readLine()); // 테스트 케이스 횟수

        String[] str = new String[N]; // 길이 N 만큼의 문자열 배열 생성

        for (int i = 0; i < str.length; i++) { // 배열 길이만큼 반복
            str[i] = br.readLine(); // 배열 길이만큼 입력을 받음
        }

        for (int i = 0; i < str.length; i++) { // 배열 길이만큼 반복
            int cnt = 0; // 카운트
            int sum = 0; // 카운트 값을 다 더함
            for (int j = 0; j < str[i].length(); j++) { // 배열 인덱스 요소의 길이 만큼 반복

                if (str[i].charAt(j) == 'O') { // 배열 인덱스 요소 길이에 문자 'O' 가 포함 되어 있다면
                    cnt++; // 카운트
                }
                else {
                    cnt = 0; // 아니라면 0
                }
                sum += cnt; // OOX 라면 처음에 1이 sum 에 저장 그 다음 2가 저장되어서 총 3이 된다.
                            // 이런 식으로 중첩이 될 수 있다.
            }
            System.out.println(sum); // 마지막으로 값을 출력
        }
    }
}
