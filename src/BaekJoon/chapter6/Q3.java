package BaekJoon.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 알파벳
        String apb = "abcdefghijklmnopqrstuvwxyz";

        // 입력 받을 문자
        String N = br.readLine();

        // 알파벳 수 만큼 반복
        for (int i = 0; i < apb.length(); i++) {
            // 입력 받은 단어에 해당 알파벳이 포함되어 있다면 인덱스 번호 출력 아니면 -1
            System.out.println(N.indexOf(apb.charAt(i)));
        }
    }
}
