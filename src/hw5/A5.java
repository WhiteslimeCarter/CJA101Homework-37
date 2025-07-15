package hw5;

// 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
// 請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合，如圖：

public class A5 {

	// 方法：產生8位驗證碼
	public String genAuthCode() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder code = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			int index = (int) (Math.random() * chars.length());
			code.append(chars.charAt(index));
		}

		return code.toString();
	}

	// 主程式：印出驗證碼
	public static void main(String[] args) {
		A5 generator = new A5();
		String authCode = generator.genAuthCode();
		System.out.println("本次隨機產生驗證碼為：" + authCode);
	}
}

//public class A5 {
//
//	public String genAuthCode() {
//		使用字符代碼 Unicode
//		String acro[];
//		for (int i = 0; i < 8; i++) {
//			int r = (int) (Math.random() * 123);
//			if (r >= 65 && r <= 90) {
//			} else if (r >= 97 && r <= 122) {
//			} else if (r >= 48 && r <= 57) {
//			}
//
//		}
//
//		String Code = "password";
//		return Code;
//	}
//
//	public static void main(String[] args) {
//		System.out.print("本次隨機產生驗證碼為：");
//
//	}
//}

/*
 * 定義可能的字符集（包含大寫字母 A-Z、小寫字母 a-z 和數字 0-9）
 * 
 * 設定驗證碼的長度為8 從字符集中隨機選取字符，重複8次 將選取的字符組合成最終的驗證碼
 * 
 * 
 * 可以考慮使用的方法：
 * 
 * 如何定義一個包含所有可能字符的集合或字串 如何從這個集合中隨機選取元素 如何將多個字符組合成一個字串
 * 
 * 
 * 考慮是否需要避免某些易混淆的字符（例如 0 和 O, 1 和 l）
 */