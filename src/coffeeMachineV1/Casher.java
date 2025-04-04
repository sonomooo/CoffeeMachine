package coffeeMachineV1;

import coffeeMachineV1.madeCoffee.Barista;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Casher {
    Barista barista = new Barista();
    private int money = 0;
    private int orderNum1 = 0;
    private int orderNum2 = 0;
    private int orderNum3 = 0;
    private int orderNum = orderNum1 + orderNum2 + orderNum3;
    List<Integer> orderArray =new ArrayList<>();
    Random random = new Random();

    public void order(int orderNumber, int price) { //order을 받은 후에 상품정보를 바리스타에게 보내고 change메서드로 돈계산
//들어온 주문을 배열에 담아야함.
        orderArray.add(orderNumber); //add메서드로 주문 번호를 저장
        money += price;
        if(orderNumber == 1) {orderNum1++;}
        else if(orderNumber == 2) {orderNum2++;}
        else if(orderNumber == 3) {orderNum3++;}
    }

    public void orderEnd(int price, int cash) {

        if (cash > 0) { // 카드결제시 0원으로 처리, 현금 결제시 0원 이상으로 거스름돈의 유무를 판단
            if (!change(price, cash)) //만약 돈이 부족하다면 리턴으로 종료
                return;
        }

        for (Integer orderNumber : orderArray) {
            barista.made(orderNumber);
        }

        int randomInt = random.nextInt(5000);

       System.out.println("라떼" + orderNum1 + "잔, 에스프레소 " + orderNum2 + " 잔, 아메리카노 " + orderNum3 +
               "잔 구매하신" + randomInt + " 번 고객님 커피주문되셨습니다.");
    }


    public boolean change(int money, int cash) { // 돈을 받고 저장 > 총매출로 출력 가능
        if (cash < this.money) {
            System.out.println("돈이 부족합니다");
            return false;
        }
        System.out.println(money + "원 받았습니다.");
        System.out.println("잔돈" + (cash - this.money) + "원 드릴게요");
        return true;
    }

    public void show() {
        System.out.println("무엇을 주문하시겠습니까?");
        barista.show();
        System.out.println("4. 정산");
    }

    public void adjustment() {
        System.out.println("총 주문 수량: " + orderNum + ", 총 주문금액: " + money + "원 입니다.");
    }
}


