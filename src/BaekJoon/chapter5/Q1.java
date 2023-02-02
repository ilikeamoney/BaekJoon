package BaekJoon.chapter5;

public class Q1 {
    // 배열의 크기는 0 <= a[i] <= 1,000,000
    // 정수 N 값 1<= N <= 3,000,000
    public long sum(int[] a) {
        long sum = 0 ;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }
}
