package coffeeMachineV1;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Casher casher = new Casher();

        casher.show();

        int orderNumber = scanner.nextInt();

        System.out.println("현금을 입력하세요. 카드결제시 현금 결제 금액은 0원입니다.");
        int cash = scanner.nextInt();

        switch (orderNumber) {

            case 1:
                casher.order(1,300,cash);
                break;
            case 2:
                casher.order(2,3000,cash);
                break;
            case 3:
                casher.order(3,30000,cash);
                break;
            default:
                System.out.println("다른 번호를 입력하세요");
        }

    }
}
