package BaekJoon.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        String N = br.readLine(); // 입력

        int cnt = 0; // 총 값을 받을 변수

        for (int i = 0; i < N.length(); i++) { // 문자열 길이 만큼
            switch (N.charAt(i)) { // 문자열 인덱스 값의 확인해서 어떤 케이스 인지 확인한다.
                case 'A' : case 'B' : case 'C' :
                    cnt += 3;
                    break;

                case 'D' : case 'E' : case 'F' :
                    cnt += 4;
                    break;

                case 'G' : case 'H' : case 'I' :
                    cnt += 5;
                    break;

                case 'J' : case 'K' : case 'L' :
                    cnt += 6;
                    break;

                case 'M' : case 'N' : case 'O' :
                    cnt += 7;
                    break;

                case 'P' : case 'Q' : case 'R' : case 'S' :
                    cnt += 8;
                    break;

                case 'T' : case 'U' : case 'V' :
                    cnt += 9;
                    break;

                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    cnt += 10;
                    break;
            }
        }
        System.out.println(cnt);
    }
}
