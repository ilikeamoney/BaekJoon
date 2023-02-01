package BaekJoon.chapter4;

import java.io.IOException;
import java.util.Scanner;

public class Q1 {
        public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);

            // 배열 크기를 정할 정수 입력
            int input = sc.nextInt();

            // 그 정수를 입력받아 리스트 크기 정의
            int[] ls = new int[input];

            // 찾고자 하는 값이 있을때 마다 카운팅 해줄 변수 선언
            int cnt = 0;

            // 내가 input 값에 넣은 만큼 반복한다
            for (int i = 0; i < input; i++) {
                // 리스트에 값을 추가함
                ls[i] = sc.nextInt();
            }
            // 리스트에 값을 다 넣고 찾을 값을 입력함
            int findVal = sc.nextInt();
            // 리스트 전체를 반복문으로 탐색
            for (int j = 0; j < ls.length ; j++) {
                // 리스트에 찾고자하는 값이 있다면
                if (ls[j] == findVal) {
                    // 카운트
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
}
