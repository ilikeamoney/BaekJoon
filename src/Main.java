import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException{
        // 아스키 코드 대문자 65 ~ 90
        // 아스키 코드 소문자 97 ~ 122

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        int[] arr = new int[26]; // 영문자의 개수는 26개임
        String s = br.readLine(); // 문자열 입력


        for (int i = 0; i < s.length(); i++) {  // 문자열 길이 만큼 반복
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {   // 97(소문자 a) < N < 122(소문자 z)
                arr[s.charAt(i) - 97]++; // arr[97 - 97]++ 이라면 arr[0] = 1 이 들어감 arr[0] 알파벳에 첫번째인 a를 의마하고 카운팅
            } else {
                arr[s.charAt(i) - 65]++; // 대문자 아스키 코드값일 경우
            }
        }
        int max = -1; // 최대 많이 카운팅된 문자를 저장할 변수
        char ch = '?'; // 많이 출력된 문자가 2개 이상이라면 ?를 출력
        for (int i = 0; i < 26; i++) { // 알파벳 배열을 돌면서 찾음

            if (arr[i] > max) { // 배열
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
