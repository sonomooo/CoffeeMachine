package coffeeMachineV1.madeCoffee;

import java.util.Timer;
import java.util.TimerTask;

public class Americano implements Coffee{
    int bean;
    int water;
    int price = 3000;

    public Americano(int espresso, int water) {
        this.bean = espresso;
        this.water = water;
    }


    @Override
    public void processing() {
        System.out.println("5초 정도 소요됩니다.");
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("아메리카노 완성.");
                timer.cancel();
            }
        };
        timer.schedule(timerTask,5000);
    }

    @Override
    public void show() {
        System.out.println("3. 아메리카노 가격: " + price);
    }
}
