package hw7;

import java.io.Serializable;

public class Cat implements Serializable {
	
	private static final long serialVersionUID = 1L; // 建議加上版本號
	
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
