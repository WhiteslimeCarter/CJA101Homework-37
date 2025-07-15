package hw9;

import java.util.Random;

public class EatingCompetition {

    public static void main(String[] args) {
    	System.out.println("-----大胃王快食比賽開始！-----");
        // 饅頭人和詹姆士的執行緒物件
        Thread mantouMan = new Thread(new Eater("饅頭人"));
        Thread james = new Thread(new Eater("詹姆士"));

        // 啟動比賽
        mantouMan.start();
        james.start();

        // 主執行緒等待兩個執行緒結束
        try {
            mantouMan.join();
            james.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("-----大胃王快食比賽結束！-----");
    }

    // 吃東西的動作實作
    static class Eater implements Runnable {
        private String name;
        private Random random = new Random();

        public Eater(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%s吃了第 %d 碗飯%n", name, i);

                try {
                    // 隨機睡眠 500~3000 毫秒
                    int sleepTime = 500 + random.nextInt(2501);
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.printf("%s 吃完了！%n", name);
        }
    }
}
