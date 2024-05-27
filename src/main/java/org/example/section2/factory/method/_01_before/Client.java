package org.example.section2.factory.method._01_before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("whiteship", "birdie@naver.com");
        System.out.println("whiteship = " + whiteship);

        Ship blackship = ShipFactory.orderShip("blackship", "birdie@naver.com");
        System.out.println("blackship = " + blackship);
    }
}
