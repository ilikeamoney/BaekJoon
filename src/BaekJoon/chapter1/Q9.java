package BaekJoon.chapter1;

import java.util.Scanner;

public class Q9 {
    // 1 1 2 2 2 8 이 출력 되도록 만들어야함
    // 0 0 1 1 1 7 = 1 1 1 1 1 1
    // 1 1 2 2 2 9 = 0 0 0 0 0 -1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8}; // 킹 퀸 비숍 나이트 룩 폰 갯수 배열로 선
        int[] findChess = new int[chess.length];

        for (int i = 0; i < chess.length; i++) { // 비어있는 배열에 입력 받음
            findChess[i] = sc.nextInt();
        }
        for (int j = 0; j < chess.length; j++) {
            System.out.println(chess[j] - findChess[j]);
            // 만약 입력값으로 95 를 넣음 그러면 1 - 95  -94
            // 95 - 94 = 1 이런식으로 배열의 값이랑 같아짐
            // 이거 순간 햇갈릴 수도 있음;
            // 입력 9
            // 8 - 9 = -1
            // 9 - 1 = 8
        }
    }
}
