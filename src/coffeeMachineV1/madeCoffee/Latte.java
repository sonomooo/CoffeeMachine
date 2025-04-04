package coffeeMachineV1.madeCoffee;

public class Latte  implements Coffee{
    int milk;
    int bean;

    public Latte(int espresso, int milk) {
        this.bean = espresso;
        this.milk = milk;
    }

    @Override
    public void processing() {
        System.out.println("라떼 나왔습니다.");
    }
}
