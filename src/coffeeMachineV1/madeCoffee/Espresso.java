package coffeeMachineV1.madeCoffee;

import java.util.Timer;
import java.util.TimerTask;

public class Espresso implements Coffee{
    int bean;
    int price = 4000;


    public Espresso(int espresso) {
        this.bean = espresso;
    }

    @Override
    public void processing() {
        System.out.println("4초 정도 소요됩니다.");
        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("에스프레소 완성.");
                timer.cancel();
            }
        };
        timer.schedule(timerTask,4000);
    }

    @Override
    public void show() {
        System.out.println("2. Espresso 가격: " + price);
    }



}
