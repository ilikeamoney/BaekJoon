package BaekJoon.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));

        // 총 과목 갯수
        double[] arr = new double[Integer.parseInt(br.readLine())];

        // 문자열 구분
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            // 과목 점수 입력
            arr[i] = Double.parseDouble(st.nextToken());
        }

        // 총 과목 점수를 더한 값
        double sum = 0;

        // 배열 요소 오름차순으로 정렬
        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {

            //  (배열은 지금 오름차순으로 정렬 되어있기 때문에 마지막 값이 가장 크다)
            //       과목점수 / 과목 점수중에 가장 큰값 * 100
            sum += (arr[i] / arr[arr.length - 1]) * 100;
        }
        System.out.println(sum / arr.length);
    }
}
