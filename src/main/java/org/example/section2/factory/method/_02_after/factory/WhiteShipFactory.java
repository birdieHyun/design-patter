package org.example.section2.factory.method._02_after.factory;


import org.example.section2.factory.method._02_after.domain.Ship;
import org.example.section2.factory.method._02_after.domain.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {

        return new WhiteShip();
    }
}
