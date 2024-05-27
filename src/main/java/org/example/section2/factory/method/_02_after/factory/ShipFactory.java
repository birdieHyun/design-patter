package org.example.section2.factory.method._02_after.factory;

import org.example.section2.factory.method._02_after.domain.Ship;

public interface ShipFactory {

    /**
     * package-private 메서드이기 때문에 같은 패키지 안에 있는 다른 ShipFactory가 호출 가능하다.
     * @param name
     * @param email
     * @return
     */
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    /**
     * 배를 만드는 메서드
     * 세부 구현은 구현체에서 함
     * @return 배
     */
    Ship createShip();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
