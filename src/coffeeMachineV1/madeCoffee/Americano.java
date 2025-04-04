package coffeeMachineV1.madeCoffee;

public class Americano implements Coffee{
    int bean;
    int water;

    public Americano(int espresso, int water) {
        this.bean = espresso;
        this.water = water;
    }

    @Override
    public void processing() {
        System.out.println("아메리카노 나왔습니다.");
    }
}
