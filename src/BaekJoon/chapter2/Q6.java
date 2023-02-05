package BaekJoon.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); // 현재 시
        int B = Integer.parseInt(st.nextToken()); // 현재 분
        int C = Integer.parseInt(br.readLine()); // 조리 시간

        int min = (60 * A) + B; // 시간을 분으로 바꿔준다.
        System.out.println(min);
        min += C; // 시간을 분으로 바꾼 값에 조리 시간을 더 해준다.


        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}
