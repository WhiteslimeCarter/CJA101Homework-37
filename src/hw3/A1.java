package hw3;
import java.util.Scanner;
import java.util.Arrays;

/* 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：
 * (提示：Scanner，三角形成立條件，判斷式if else)
 * (進階功能：加入直角三角形的判斷)
 * a+b>c、a+c>b、b+c>a
 * 方法呼叫、陣列
 */

public class A1 {
	
	public static void main(String[] args) {
// #1
		System.out.println("請輸入三個邊長：");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		
		for(int i = 0;i < arr.length; i++) {
			if(sc.hasNextInt()) {
				arr[i] = sc.nextInt();	
			}
		}
		
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		System.out.println("輸入三邊長為：" + a + " "+ b + " " +c + "\n");
		
		
		
		if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
			if (a == 0 || b == 0 || c == 0) {
				System.out.println("不是三角形");
			} else {
				System.out.println("不符合三角形條件，請重新輸入");
			}
		} else {
			if ((a + b) > c || (a + c) > b || (b + c) > a) {
				if (a == b && b == c && c == a) {
					System.out.println("正三角形");
				} else if ((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a)) {
				    System.out.println("直角三角形"); // 進階：直角三角形
			    } else if (a == b || a == c || b == c) {
			    	if (a != b || a != c || b != c) {
			    		System.out.println("等腰三角形");
			    		}
			    } else {
			    	System.out.println("其他三角形");
			    	}
				}
			}
		}
	}
	


// #2	
//		int a;
//		int b;
//		int c;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入：");
//		if (sc.hasNextInt()) {
//			a = sc.nextInt();
//			b = sc.nextInt();
//			c = sc.nextInt();
//			System.out.print(a + " " + b + " " + c + "\n");
//			if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
//				if (a == 0 || b == 0 || c == 0) {
//					System.out.println("不是三角形");
//				} else {
//					System.out.println("不符合三角形條件，請重新輸入");
//				}
//			} else {
//				if ((a + b) > c || (a + c) > b || (b + c) > a) {
//					if (a == b && b == c && c == a) {
//						System.out.println("正三角形");
//					} else if ((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b)
//							|| (b * b) + (c * c) == (a * a)) {
//						System.out.println("直角三角形"); // 進階：直角三角形
//					} else if (a == b || a == c || b == c) {
//						if (a != b || a != c || b != c) {
//							System.out.println("等腰三角形");
//						}
//					} else {
//						System.out.println("其他三角形");
//					}
//				}
//			}
//		}
//	}
//}