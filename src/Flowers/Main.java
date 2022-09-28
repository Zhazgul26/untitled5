package Flowers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flower rose1 = new Flower(Freshness.FULLFREHNESS,30,300);
        Flower rose2 = new Flower(Freshness.MILDDLEFRESH,24,250);
        Flower rose3 = new Flower(Freshness.OLDFRESH,30,200);
        Flower lily1 = new Flower(Freshness.FULLFREHNESS,30,290);
        Flower lily2 = new Flower(Freshness.MILDDLEFRESH,25,290);
        Flower lily3 = new Flower(Freshness.OLDFRESH,25,290);
        Flower lotus1 = new Flower(Freshness.MILDDLEFRESH,30,400);
        Flower lotus2 = new Flower(Freshness.FULLFREHNESS,35,450);
        Flower lotus3 = new Flower(Freshness.OLDFRESH,40,500);

        Bouqet bouqet = new Bouqet();
        bouqet.addFlower(rose1);
        bouqet.addFlower(rose2);
        bouqet.addFlower(rose3);
        bouqet.addFlower(lily1);
        bouqet.addFlower(lily2);
        bouqet.addFlower(lily3);
        bouqet.addFlower(lotus1);
        bouqet.addFlower(lotus2);
        bouqet.addFlower(lotus3);

    }
}
