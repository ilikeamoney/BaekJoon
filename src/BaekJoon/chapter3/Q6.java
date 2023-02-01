package BaekJoon.chapter3;

import java.io.*;
import java.util.StringTokenizer;

public class Q6 {
        public static void main(String[] args) throws IOException {
            // 입력 생성
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // 출력 생성
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


            int N = Integer.parseInt(br.readLine());

            StringTokenizer st;

            for (int i = 1; i < N + 1; i++) {
                st = new StringTokenizer(br.readLine()," "); // 한줄을 읽는데 공백을 기준으로 나눔
                bw.write("Case #"+ i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
            }
            br.close();

            bw.flush();
            bw.close();
        }
}
