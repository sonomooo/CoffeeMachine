package coffeeMachineV1.madeCoffee;

public class Espresso implements Coffee{
    int bean;


    public Espresso(int espresso) {
        this.bean = espresso;
    }

    @Override
    public void processing() {
        System.out.println("에스프레소 나왔습니다.");
    }


}
