package BaekJoon.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
    public static void main(String[] args) throws IOException {
        // 아스키 코드 대문자 65 ~ 90
        // 아스키 코드 소문자 97 ~ 122

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        int[] arr = new int[26]; // 알파벳 갯수랑 같은 배열
        // arr[i] i 가 0 부터 시작해 ++ 될때마다 배열의 인덱스 번호는 곧 알파벳을 의미한다.

        String N = br.readLine(); // 사용자가 문자열 입력

        for (int i = 0; i < N.length(); i++) {  // 입력받는 문자열 길이만큼 반복
            if ('a' <= N.charAt(i) && N.charAt(i) <= 'z') {
                // 문자열 N의 각 인덱스마다 알파벳에 아스키 코드 값은 소문자 a 즉 97보다 크거나 같고 122 보다 작다 같다.
                arr[N.charAt(i) - 97]++;
                // 문자열 아스키 코드 값과 소문자 a의 아스키 코드 값을 빼면 배열의 인덱스 번호를 접근할 수 있고
                // 배열의 인덱스 순서는 곧 알파벳 순서를 의미한다.
            } else {
                arr[N.charAt(i) - 65]++; // 대문자도 마찬가지 이다.
            }
        }

        int max = -1; // 배열에는 0 값으로 초기화 되어있기 때문에 안전하게 -1과 비교하는거 같음
        char apb = '?'; // 출력으로 알파벳 문자를 받을 변수

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // 배열에 ++ 된 값과 비교
                max = arr[i]; // 그 값을 max 변수에 대입
                apb = (char) (65 + i); // 배열 인덱스가 2이면 c를 의미하고 대문자로 출력하라고 했으니 65 + i(2)를 하면 대문자 C가 나옴
            } else if (max == arr[i]) { // max 값과 arr[i] 값이 같다면
                apb = '?';
            }
        }
        System.out.println(apb);
    }
}
