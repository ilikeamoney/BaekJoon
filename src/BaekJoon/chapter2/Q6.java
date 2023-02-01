package BaekJoon.chapter2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); // 현재 시각 ex -> 12
        int B = in.nextInt(); // 현재 분 ex -> 50
        int C = in.nextInt(); // 조리 시간 ex -> 30

        int min = 60 * A + B;   // 시 -> 분
        min += C;

        // 770 + 30 = 800

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}
