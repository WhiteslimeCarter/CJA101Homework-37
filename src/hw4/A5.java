package hw4;

import java.util.Scanner;

//設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

public class A5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入西元 yyyy 年 mm 月 dd 日：");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        if (year <= 0) {
            System.out.println("年份輸入有誤，請重新輸入");
            return;
        }

        if (!isValidDate(year, month, day)) {
            System.out.println("月份或日期輸入有誤，請重新輸入");
            return;
        }

        int dayOfYear = calculateDayOfYear(year, month, day);
        System.out.println("輸入的日期為該年第 " + dayOfYear + " 天");
    }

    // 判斷是否為閏年
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 驗證日期是否合法
    public static boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) return false;

        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // 修正2月天數
        }

        return day >= 1 && day <= daysInMonth[month - 1];
    }

    // 計算該日期為當年第幾天
    public static int calculateDayOfYear(int year, int month, int day) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += daysInMonth[i];
        }
        sum += day;
        return sum;
    }
}
