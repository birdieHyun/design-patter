package org.example.section2.factory.method._01_before;

import org.example.section2.factory.method._01_before.Ship;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("로고");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("로고");
        }


        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("흰색");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("검정색");
        }

        return ship;
    }
}
