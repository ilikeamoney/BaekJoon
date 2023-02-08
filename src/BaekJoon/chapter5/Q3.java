package BaekJoon.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

            System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));

        }

        public static int arithmetic_sequence(int num) {
            int cnt = 0; // 한수 카운팅

            if (num < 100) { // 1 ~ 99 까지는 모두 수열을 이룬다.
                return num;  // 매개변수가 100 이하라면 그 수 자체가 수열의 갯수
            }

            else {
                cnt = 99; // 99 이상이 가질 수 있는 최소의 한수 갯수
                for (int i = 100; i <= num; i++) {
                    int hun = i / 100; // 백의 자릿수
                    int ten = (i / 10) % 10; // 십의 자릿수
                    int one = i % 10; // 일의 자릿수

                    if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면
                        cnt++; // 한수
                    }
                }
            }
            return cnt;
        }

}

