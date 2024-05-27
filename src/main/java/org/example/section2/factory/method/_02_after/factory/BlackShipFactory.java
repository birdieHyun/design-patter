package org.example.section2.factory.method._02_after.factory;

import org.example.section2.factory.method._02_after.domain.BlackShip;
import org.example.section2.factory.method._02_after.domain.Ship;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {

        return new BlackShip();
    }
}
