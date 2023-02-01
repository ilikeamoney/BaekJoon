package BaekJoon.chapter3;

import java.io.*;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws IOException {
        // 입력 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
