package org.example.section1.factory._01_method._02_after.factory;

import org.example.section1.factory._01_method._02_after.domain.BlackShip;
import org.example.section1.factory._01_method._02_after.domain.Ship;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {

        return new BlackShip();
    }
}
