package BaekJoon.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열로 입력 받고
        String A = br.readLine();

        // A 문자열 인덱스 0번째를 charAt() 으로 빼고
        // 그 char 문자를 (int) 형 변환 출력
        System.out.println((int) A.charAt(0));

    }
}
