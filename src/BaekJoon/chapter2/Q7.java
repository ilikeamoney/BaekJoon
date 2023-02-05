package BaekJoon.chapter2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a, b, c;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        // 만약 모든 변수가 다른 경우
        if (a != b && b != c && a != c) {
            // 최댓값을 저장할 변수 선언
            int max;
            // a > b 상황
            if (a > b) {
                // c > a 상황
                if (c > a) {
                    max = c;
                } else {
                    max = a;
                }
            }
            // b > c 상황
            else {
                if (c > b) {
                    max = c;
                } else {
                    max = b;
                }
            }
            System.out.println(max * 100);
        } else {
            // 입력 값 모두가 같은 상황
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
                // 그렇지 못하고 한쌍만 같은 상황
            } else {
                if (a == b || a == c) {
                    System.out.println(1000 + a * 100);
                } else {
                    System.out.println(1000 + b * 100);
                }
            }
        }
    }
}
