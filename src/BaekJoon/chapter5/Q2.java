package BaekJoon.chapter5;

public class Q2 {
    public static void main(String[] args) {

        boolean[] check = new boolean[10001]; // 생성자 =  true,  셀프 넘버 = false boolean 배열 선언

        for (int i = 1; i < 10001; i++){

            int n = d(i); // 1 ~ 10000 반복 동안 n = 생성자


            if(n < 10001){ // n < 10001 동안

                check[n] = true; // boolean[생성자] = true
            }
        }

        StringBuilder sb = new StringBuilder(); // 셀프넘버(false) 담기 위한 생성자

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {  // if check[i] 중 false 면
                              // boolean 은 false 기본 옵션
                sb.append(i).append('\n'); // 추가 줄바꿈
            }
        }
        System.out.println(sb); // 출력
    }

    // 함수 분석
    public static int d(int number){  // ex) number = 1234
        int sum = number;     // sum = 1234

        while(number != 0){   // 매개변수 number 가 0 이 아닐동안 반복 1. 1234, 2. 123,

            sum = sum + (number % 10);  // 1 번쨰 반복 sum = 1234 + 4  (number % 10) = 4
                                        // 2 번째 반복 sum = 1238 + 3  (number % 10) = 3

            number = number/10;  // 1. number =  123   1234 / 10 = 123
                                 // 2. number =  12    123  / 10 = 12
            }

        return sum;  // 현재  1. sum = 1238
                     //      2. sum = 1241

        // 이거 생성자 매커니즘은 어떻게 짤 수 있엇는데
        // 반대 개념은 전혀 생각 하지 못함 그래도 코드는 이해할 수 있음
    }
}
