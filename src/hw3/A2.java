package hw3;

import java.util.Scanner;

/* 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
 * (提示：Scanner，亂數方法，無窮迴圈)
 * (進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
 */

public class A2 {

	public static void main(String[] args) {
//		int i = (int) (Math.random() * 10);  // 0~9
		int i = (int) (Math.random() * 101); // 進階題
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("請猜一個數字：");
			int j = sc.nextInt();
			if (j == i) {
				System.out.println("答對，答案就是" + i);
				break;
			} else {
//				System.out.println("猜錯，答案不是" + j)  // 0~9
				if( j > i) {
					System.out.println("猜錯，答案不是" + j + "，大於正確答案"); // 進階題0~100
				} else {
					System.out.println("猜錯，答案不是" + j + "，小於正確答案"); // 進階題0~100
					
				}
			}
		}
	}
}