package BaekJoon.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문제 더하기 싸이클
        // 1. 어떤 0 보다크고 99 같거나 작은 수가 주어짐 ex) 26
        // 1-1. 만약 주어진수가 10보다 작을시 앞에 0을 붙여서 두자리 수를 만든다
        // 2. 그 수를 앞자리 뒷자리를 더함 ex) 2 + 6 = 8
        // 3. 각 자리를 더한 총 값에 뒷자리 와 처음에 주어진 수 뒷자리를 조합해서 새로운 수를 만듬 6 + 8 = 68
        // 4. 위에 작업을 반복함
        // 5. 와 근데 수학적으로 접근하니까 진짜 대박임;; 어떻게 이런 생각을 할 수 있을까..

        int N = Integer.parseInt(br.readLine()); // 입력 : 26

        int cnt = 0;
        int copy = N; // 변수 복사 copy = 26 이라는 값이 들어가게 된다

        do {
            // 반복문에서 N에 새로운 값을 대입한다.
            // 하지만 기존에 N값은 유지됨
            N = ((N % 10) * 10) + ((N / 10) + (N % 10)) % 10;
            // ? = ((26 % 10) * 10) + ((26 / 10) + (26 % 10)) % 10
            // ? =      (6  *  10)  +  (2  +  6) % 10
            // ? =          68      +    8      ,8 % 10 = 8
            // ? = 68
            // 그래서 처음에 N의 값 26 의 1의 자릿수가 새로운 수의 10의 자리에 들어감 = 6
            // 그리고 처음에 N 값의 각 자리수를 더한 값 2 + 6 = 8의 1의 자리가 새로운 수 1의 자리에 들어감 = 8
            // 이 매커니즘을 완벽하게 일치시킴

            cnt++;
            // 루프가 반복 될때마다 실행 +1 된다
        } while (N != copy); // 입력값이 변수 복사한 것과 같지 않을 때 까지 반복

        System.out.println(cnt);
    }
}
