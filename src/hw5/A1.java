package hw5;

import java.util.Scanner;

// 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如圖：
//System.out.print("*" + " ");
public class A1 {
	
	public static void starSquare(int width, int height) {
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("請輸入寬與高:");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		A1 sq = new A1();
		sq.starSquare(width, height);
	}
}
