package hw3;

import java.util.Scanner;

/* 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數：
 * (提示：Scanner)
 * (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
 * [j > (i*10)+9 和 j < i*10] 或
 * 用方法呼叫
 */

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入討厭的數字(1~9)：");
        // 不喜歡的數字
		int dislike = sc.nextInt();
		int j = 0;
		for (int i = 1; i <= 49; i++) {
			if (!no(i, dislike)) {
				j++;
				System.out.print(i + " ");
			}
		}
		System.out.print("\n共有" + j + "個可以選擇的數字");
		System.out.print("\n提供六個不重複號碼：");
		
		
	}
	
	// 檢查數字是否包含 'i'
	public static boolean no(int i, int dislike) {
		return String.valueOf(i).contains(String.valueOf(dislike));
	}
}