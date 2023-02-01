package BaekJoon.chapter3;

import java.util.Scanner;

public class Q4 {
    // 첫쨰 줄에 영수증에 적힌 총 금액 X가 주어진다
    // 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다
    // 셋째 이후 N개의 줄에는 각 물건의 가격 a와 개수 b 가 공백을 사이에 두고 주어진다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 총 금액
        int totalItems = sc.nextInt(); // 구매 목록 수
        int whatAmIBuy = 0;
        for (int i = 0; i < totalItems; i++) {
            int itemPrice = sc.nextInt();
            ; // 물건의 가격
            int countItems = sc.nextInt(); // 물건의 구매 갯수
            whatAmIBuy += itemPrice * countItems;
        }
        if (x == whatAmIBuy) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
