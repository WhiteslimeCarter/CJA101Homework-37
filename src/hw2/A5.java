package hw2;

import java.util.Scanner;

//阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
//用方法呼叫

public class A5 {
	public static void main(String[] args) {
// #1 數學補集法
		int i;
		int j = 0;
		for(i= 1; i <= 49;i++) {
			if(i < 40 && i != 4 && i != 14 && i != 24 && i != 34) {
				j++;
				System.out.print(i + " ");
			}
		}
		System.out.print("\n共有" + j +"個可以選擇的數字");
	}
}
		
// #2 方法呼叫(過濾掉包含'4')
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入討厭的數字(1~9)：");
//
//		int i;
//		int j = 0;
//		for (i = 1; i <= 49; i++) {
//			if (!no(i)) {
//				j++;
//				System.out.print(i + " ");
//			}
//		}
//		System.out.print("\n共有" + j + "個可以選擇的數字");
//	}
//
//    // 檢查數字是否包含 '4'
//	public static boolean no(int i) {
//		return String.valueOf(i).contains("4");
//	}
//}

