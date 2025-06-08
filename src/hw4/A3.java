package hw4;

// 有個字串陣列如下(八大行星)：
// {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
// (提示：字元比對，String方法)

public class A3 {

	public static void main(String[] args) {
		int sum = 0;
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		for (int i = 0; i < planet.length; i++) {
			String no = planet[i];
			for (int j = 0; j < no.length(); j++) {
				switch (no.charAt(j)) { // 也可用if (no.charAt(j) == target)
				case 'a':
					sum++;
					break;
				case 'e':
					sum++;
					break;
				case 'i':
					sum++;
					break;
				case 'o':
					sum++;
					break;
				case 'u':
					sum++;
					break;
				default:
				}
			}
		}
		System.out.println("共有" + sum + "個母音");
	}
}
