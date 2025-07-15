package hw7;

//承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
//型簡化本題的程式設計)

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class A5 {
    public static void main(String[] args) {
        String filePath = "C:/data/Object.ser";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                try {
                    Object obj = ois.readObject();

                    // 利用多型呼叫 speak()
                    if (obj instanceof Dog) {
                        ((Dog) obj).speak();
                    } else if (obj instanceof Cat) {
                        ((Cat) obj).speak();
                    } else {
                        System.out.println("讀取到非 Dog/Cat 物件: " + obj);
                    }
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
