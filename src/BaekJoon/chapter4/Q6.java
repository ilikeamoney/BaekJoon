package BaekJoon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q6 {
        public static void main(String[] args) throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

            StringTokenizer st; // 입력 구분 대기

            int divInt = 42; // 나누는 값 고정

            // 1. HashSet 은 Set 에서 파생 되었다.
            // 2. HashSet 은 중복된 값을 저장하지 않는다.
            // 3. HashSet 은 순서 개념이 없다. 만약 정렬하고 싶다면 List 로 변환후 정렬 해야함
            HashSet<Integer> hs = new HashSet<>();

            for (int i = 0; i < 10; i++) {
                st = new StringTokenizer(br.readLine(), "\n"); // 한 줄을 읽는데 개행을 기준으로 읽는다.

                // 입력된 값에 42를 나눈 값을 저장한다.
                // HashSet 은 중복을 저장하지 않는다 나머지 값이 같다면 저장하지 않는다.
                hs.add(Integer.parseInt(st.nextToken()) % divInt);
            }
            System.out.println(hs.size()); // 값을 저장한 크기가 즉 나머지 값이 다른 갯수와 동일 하다.
        }
}
