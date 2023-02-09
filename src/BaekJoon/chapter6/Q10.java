package BaekJoon.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 문자열 입력

        int len = str.length(); // 반복문 루프 횟수 (문자열 길이)
        int count = 0; // 문자 카운트

        for (int i = 0; i < str.length(); i++) { // 문자열 길이 까지 반복

            char ch = str.charAt(i); // 문자열에 문자 한개 한개 마다 변수에 넣는다.

            if(ch == 'c' && i < len - 1) {
                //만약 ch 다음 문자가 '=' 또는 '-' 이라면?
                if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    // i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                    i++;
                }
            }

            else if(ch == 'd' && i < len - 1) { // 문자가 'd' 이거나 현재 인덱스가 문자열 길이 -1 보다 작을때
                if(str.charAt(i + 1) == '-') {	// d- 일 경우
                    i++; // 문자 건너 뜀
                }
                else if(str.charAt(i + 1) == 'z' && i < len - 2) { // 문자 d 뒤에 z 문자가 있고 현재 인덱스 i 가 len -2 보다 작다면

                    if(str.charAt(i + 2) == '=') {	// dz= 일 경우
                        i += 2;
                    }
                }
            }

            else if((ch == 'l' || ch == 'n') && i < len - 1) {
                if(str.charAt(i + 1) == 'j') {	// lj 또는 nj 일 경우
                    i++;
                }
            }


            else if((ch == 's' || ch == 'z') && i < len - 1) {
                if(str.charAt(i + 1) == '=') {	// s= 또는z= 일 경우
                    i++;
                }

            }

            count++;

        }

        System.out.println(count);
    }
}
