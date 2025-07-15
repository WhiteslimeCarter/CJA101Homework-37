package hw5;

// A4：
/*
 * MyRectangle：
請設計一個類別MyRectangle：
(1) 有兩個double型態的屬性為width, depth
(2) 有三個方法：
void setWidth(double width): ?
void setDepth(double depth): ?
double getArea(): ?
(3) 有兩個建構子：
public MyRectangle(): 
public MyRectangle(double width, double depth):
=================================================
MyRectangleMain：
1.請另外建立一個MyRectangleMain類別，此類別只有main方法
2.將收到的引數指定給width屬性
3.將收到的引數指定給depth屬性
MyRectangle：
1.能計算該長方形的面積
2.不帶參數也無內容的建構子
MyRectangleMain：
1.傳入的兩個引數會指定給對應的屬性
MyRectangle：
(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
*/

public class MyRectangle {
	// (1) 屬性
	private double width;
	private double depth;

	// (3-1) 無參數建構子
	public MyRectangle() {
		// 可不寫任何內容，保留預設
	}

	// (3-2) 有參數建構子
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	// (2-1) 設定寬度
	public void setWidth(double width) {
		this.width = width;
	}

	// (2-2) 設定深度
	public void setDepth(double depth) {
		this.depth = depth;
	}

	// (2-3) 計算面積
	public double getArea() {
		return width * depth;
	}
}
