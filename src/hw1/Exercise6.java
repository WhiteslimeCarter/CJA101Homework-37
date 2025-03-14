package hw1;

/*請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
  5 + 5
  5 + ‘5’
  5 + “5”
  並請用註解各別說明答案的產生原因
 */
public class Exercise6 {

	public static void main(String[] args) {

		System.out.println(5 + 5);
		// 5+5代表數字相加
		System.out.println(5 + '5' - 5);
		// 5+'5'代表數字和字元值相加 ??
		System.out.println(5 + "5");
		// 5+"5"代表的是字串連接
	}

}
