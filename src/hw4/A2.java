package hw4;

// 請建立一個字串，經過程式執行後，輸入結果是反過來的
// 例如String s = “Hello World”，執行結果即為dlroW olleH
// (提示：String方法，陣列)

public class A2 {
	
	public static void main(String[] args) {
		String s =  "Hello World";
		int r = s.length();
		for (int i = r - 1; i >= 0; i--) { //索引從0開始算，所以會是字串長度-1(因為s[0]為第一個字母)，r不-1會造成超出索引範圍(變成字串多一個找不到的字)
			System.out.print(s.charAt(i));
		}
	}
}
