package hw4;

import java.util.Scanner;

// 設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
// 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
// (提示1：Scanner，陣列)
// (提示2：需將閏年條件加入)
// (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

public class A5 {

	// 1.main方法Scanner 輸入年月日，陣列列出每個月天數
	public static void main(String[] args) {
		System.out.println("請輸入西元yyyy(年) mm(月) dd(日)");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

		// 2.呼叫方法
		if (year != 0) {
			if (judgeyear(year)) { // 閏年
				judgemd(month, day);

			} else { // 平年
				judgemd(month, day);
			}
		} else {
			System.out.println("年份輸入有誤，請重新輸入");
		}

	}
	// 3.判斷閏年:被4整除且不被100整除，或被400整除者

	public static boolean judgeyear(int year) {
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}

	// 4.日期加總
	public static void judgemd(int month, int day) {
		int sumday = 0;
		int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
			for (int i = 0; i < (month - 1); i++) {
				sumday += m[i];
			}
			sumday += day;
			System.out.println(sumday);
		} else {
			System.out.println("月份日期有誤，請重新輸入");
		}
	}
}
