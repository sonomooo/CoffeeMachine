package coffeeMachineV1;

import java.util.Random;
import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {

            Scanner scanner = new Scanner(System.in);
            Casher casher = new Casher();

            casher.show();

            while (true) {

            //int orderNumber = scanner.nextInt();
            int orderNumber = random.nextInt(5);

                if (orderNumber == 4) {
                    System.out.println("주문을 종료합니다");
                    casher.adjustment();
                    break;
                }


                switch (orderNumber) {

                    case 1:
                        casher.order(1, 5000);
                        break;
                    case 2:
                        casher.order(2, 4000);
                        break;
                    case 3:
                        casher.order(3, 3000);
                        break;
                    default:
                        System.out.println("다른 번호를 입력하세요");
                }

                  try {
                        if (orderNumber == 0) {
                            throw new RuntimeException("주문하지 않고 갔습니다.");
                        }
                    } catch (RuntimeException e) {
                        System.out.println("예외처리, message = " + e.getMessage());
                    }
                }

            System.out.println("현금을 입력하세요. 카드결제시 현금 결제 금액은 0원입니다.");
           // int cash = scanner.nextInt();
            int cash = random.nextInt(20000) + 10000;
            casher.orderEnd(0, cash);

        }


    }
}
