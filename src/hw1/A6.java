package hw1;

/*請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
  5 + 5
  5 + ‘5’
  5 + “5”
  並請用註解各別說明答案的產生原因
 */
public class A6 {

	public static void main(String[] args) {
		
		char ch = '5';
		int i = ch;
		System.out.println(i); //字元十進位值

		System.out.println(5 + 5);
		// 5+5 代表數字相加.
		System.out.println(5 + '5');
		// 5+'5'代表數字 5 和字元十進位值 '5'=53 相加.
		System.out.println(5 + "5");
		// 5+"5"代表的是字串連接.
	}

}
