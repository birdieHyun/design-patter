package org.example.section1.factory._01_method._02_after;


import org.example.section1.factory._01_method._02_after.factory.BlackShipFactory;
import org.example.section1.factory._01_method._02_after.factory.ShipFactory;
import org.example.section1.factory._01_method._02_after.factory.WhiteShipFactory;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "birdie@naver.com");
        client.print(new BlackShipFactory(), "blackship", "birdie@gmail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
