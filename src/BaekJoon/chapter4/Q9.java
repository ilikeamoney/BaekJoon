package BaekJoon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        int N = Integer.parseInt(br.readLine()); // 반복문 횟수

        int[] arr; // 반 학생 수

        StringTokenizer st; // 문자 구분 대기

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 문자열 구분

            int T = Integer.parseInt(st.nextToken()); // 학생 수

            arr = new int[T]; // 학생 수 만큼 배열 크기 지정

            double sum = 0; // 총 점수

            for (int j = 0; j < T; j++) {
                arr[j] = Integer.parseInt(st.nextToken()); // 반 학생의 점수 입력


                sum += arr[j]; // 점수를 다 더함
            }

            double avg = (sum / T); // 평균
            double cnt = 0; // 평균을 넘은 학생 수

            for (int j = 0; j < T; j++) {
                if (arr[j] > avg) { // 평균을 넘는다면?
                    cnt++; // 카운트
                }
            }
            System.out.printf("%.3f%%\n",(cnt/T)*100);
        }
    }
}
