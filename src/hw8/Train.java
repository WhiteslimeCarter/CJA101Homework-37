package hw8;

import java.util.Objects;

public class Train {
    // 屬性定義
    private int number;        // 班次
    private String type;       // 車種
    private String start;      // 出發地
    private String dest;       // 目的地
    private double price;      // 票價

    // 建構子
    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    // Getter 與 Setter 方法
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 顯示列車資訊的方法
    public void displayInfo() {
        System.out.println("班次：" + number + ",車種：" + type + ",出發地：" + start + ",目的地：" + dest + ",票價：" + price + " 元");
        System.out.println("========================================================");
    }
    
    // 加上 equals() 方法：用來判斷兩個物件內容是否相同
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Train)) return false;
        Train other = (Train) obj;
        return number == other.number &&
               Double.compare(price, other.price) == 0 &&
               Objects.equals(type, other.type) &&
               Objects.equals(start, other.start) &&
               Objects.equals(dest, other.dest);
    }

    // 加上 hashCode() 方法：搭配 equals 使用在 Set、Map 中避免重複
    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }
}
