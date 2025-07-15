package hw8;

import java.math.BigInteger;
import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        // 1. 建立 Collection 並加入元素
        Collection<Object> collection = new ArrayList<>();

        collection.add(Integer.valueOf(100));
        collection.add(Double.valueOf(3.14));
        collection.add(Long.valueOf(21L));
        collection.add(Short.valueOf("100"));
        collection.add(Double.valueOf(5.1));
        collection.add("Kitty");
        collection.add(Integer.valueOf(100));
        collection.add(new Object());
        collection.add("Snoopy");
        collection.add(new BigInteger("1000"));

        // 2. 使用 Iterator 印出所有元素
        System.out.println("=== 使用 Iterator ===");
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2. 使用傳統 for 印出所有元素 (需轉型為 List)
        System.out.println("=== 使用傳統 for ===");
        List<Object> list = new ArrayList<>(collection);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2. 使用 foreach 印出所有元素
        System.out.println("=== 使用 foreach ===");
        for (Object obj : collection) {
            System.out.println(obj);
        }

        // 3. 移除不是 java.lang.Number 相關的物件
        collection.removeIf(obj -> !(obj instanceof Number));

        // 4. 再次印出集合內容
        System.out.println("=== 移除非 Number 類型後的集合內容 ===");
        for (Object obj : collection) {
            System.out.println(obj);
        }
    }
}