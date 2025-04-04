package coffeeMachineV1.madeCoffee;

public class Barista {

    Coffee coffee;
    Coffee americano =  new Americano(40,200);
    Coffee espresso = new Espresso(30);
    Coffee Latte = new Latte(40,100);


    public Coffee made(int coffeeNumber) { //무슨 커피를 만들지 이제 안다! > 커피에게 메세지 전송

        System.out.println("커피가 제조중입니다....");
        if (coffeeNumber == 3){
            this.coffee = americano;
            americano.processing();

        } else if (coffeeNumber == 2){
            this.coffee = espresso;
            espresso.processing();

        } else if (coffeeNumber == 1){
            this.coffee = Latte;
            Latte.processing();

        } else {
            System.out.println("?");
        }

        return coffee;

    }

    public void show(){
        Latte.show();
        espresso.show();
        americano.show();
    }
}
