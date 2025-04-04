package coffeeMachineV1;

import coffeeMachineV1.madeCoffee.Barista;

public class Casher {
    Barista barista = new Barista();
    private int money = 0;

    public void order(int orderNumber, int price, int cash){ //order을 받은 후에 상품정보를 바리스타에게 보내고 change메서드로 돈계산

        if(cash>0) {
            if (!change(price, cash))
            return;
        }

        barista.made(orderNumber); //반환받은 참조값은 어디로??

        money += price;
    }

    public boolean change(int price, int cash) { // 돈을 받고 저장 > 총매출로 출력 가능
        if (cash < price) {
            System.out.println("돈이 부족합니다");
            return false;
        }
            System.out.println("잔돈" + (cash - price) + " 드릴게요");
            return true;
        }

        public void show () {
            System.out.println("무엇을 주문하시겠습니까?");
            System.out.println("1. 아메리카노 : 300");
            System.out.println("2. 에스프레소 : 3000");
            System.out.println("3. 라떼 : 30000");
        }


}


