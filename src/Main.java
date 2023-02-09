import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        크로아티아
       알파벳	변경
        č	c=
        ć	c-
        dž	dz=
        đ	d-
        lj	lj
        nj	nj
        š	s=
        ž	z=
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

        String N = br.readLine(); // 문자열 입력

        int cnt = 0; // 단어 갯수 카운트 변수

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == 'l' || N.charAt(i) == 'j') {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
