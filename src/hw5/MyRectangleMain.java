package hw5;

// A4：
public class MyRectangleMain {

	public static void main(String[] args) {
		// (1) 使用無參數建構子建立物件，並設定 width, depth 為 10, 20
		MyRectangle rect1 = new MyRectangle();
		rect1.setWidth(10);
		rect1.setDepth(20);
		System.out.println("使用 set 方法設定後，面積為：" + rect1.getArea());

		// (2) 使用有參數建構子直接設定 width, depth 為 10, 20
		MyRectangle rect2 = new MyRectangle(10, 20);
		System.out.println("使用建構子直接指定屬性，面積為：" + rect2.getArea());
	}
}
