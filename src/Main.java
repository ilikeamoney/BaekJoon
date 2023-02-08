import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        String S = br.readLine(); // 공백이 포함된 문자열 입력

        StringTokenizer st = new StringTokenizer(S, " "); // 입력된 S를 공백을 기준으로 읽음

        System.out.println(st.countTokens()); // 그 안에 몇개에 단어가 있는지 출력
    }
}
