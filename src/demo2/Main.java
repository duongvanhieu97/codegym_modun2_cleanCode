package demo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn hãy nhập");
        String status = scanner.nextLine();
        System.out.println(status);
        Order order = new Order(status);
        if (order.getStatus() == "paid") {
            System.out.println("Order war paid");
        }
//        if (order.isPaid()) {
//            System.out.println("Order war paid");
//        }

    }
}
