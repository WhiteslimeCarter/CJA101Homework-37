package hw7;

import java.io.Serializable;

public class Dog implements Serializable {
	
	private static final long serialVersionUID = 1L; // 建議加上版本號
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
