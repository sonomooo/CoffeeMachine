package coffeeMachineV1.madeCoffee;

import java.util.Timer;
import java.util.TimerTask;

public class Latte  implements Coffee {
    int milk;
    int bean;
    int price = 5000;
    Timer timer = new Timer();

    public Latte(int espresso, int milk) {
        this.bean = espresso;
        this.milk = milk;
    }

    @Override
    public void processing() {
        System.out.println("8초 정도 소요됩니다.");
        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("라떼 완성.");
                timer.cancel();
            }
        };


        timer.schedule(timerTask,8000);
    }

    @Override
    public void show() {
        System.out.println("1. Latte 가격: " + price);
    }
}
